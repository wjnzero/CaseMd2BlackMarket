package storage.equipment;

import model.equipment.Equipment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile implements IReadWriteEquipment{

    private ReadWriteFile() {
    }

    private static ReadWriteFile readWriteFile;

    public static ReadWriteFile getInstance(){
        if (readWriteFile == null)
            readWriteFile = new ReadWriteFile();
        return readWriteFile;
    }

    //doc file -> hang hoa hien co
    @Override
    public List<Equipment> readData() {
        List<Equipment> equipmentList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Object obj = null;
        try {
            fis = new FileInputStream("equipment available.csv");
            ois = new ObjectInputStream(fis);
            obj = ois.readObject();
        }
        catch (FileNotFoundException e){
            System.out.println("null");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        equipmentList = (List<Equipment>) obj;
        return equipmentList;
    }
    //ghi file -> hang hoa hien co
    @Override
    public void writeData(List<Equipment> list) {
        try {
            FileOutputStream fos = new FileOutputStream("equipment available.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
