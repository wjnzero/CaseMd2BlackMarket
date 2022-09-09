package storage.user;

import model.user.Survival;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteSurvival implements IReadWriteSurvival {

    private ReadWriteSurvival() {
    }

    private static ReadWriteSurvival readWriteSurvival;

    public static ReadWriteSurvival getInstance(){
        if (readWriteSurvival == null)
            readWriteSurvival = new ReadWriteSurvival();
        return readWriteSurvival;
    }
    @Override
    public List<Survival> readData() {
        List<Survival> survivalList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Object obj = null;
        try {
            fis = new FileInputStream("survival available.csv");
            ois = new ObjectInputStream(fis);
            obj = ois.readObject();
        }
        catch (FileNotFoundException e){
            System.out.println("null");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        survivalList = (List<Survival>) obj;
        return survivalList;
    }

    @Override
    public void writeData(List<Survival> list) {
        try {
            FileOutputStream fos = new FileOutputStream("survival available.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
