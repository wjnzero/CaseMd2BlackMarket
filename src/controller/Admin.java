package controller;

import model.equipment.Equipment;
import storage.equipment.IReadWriteEquipment;
import storage.equipment.ReadWriteFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Admin implements Serializable {
    private static IReadWriteEquipment readEquip = ReadWriteFile.getInstance();
    public static List<Equipment> equipmentList;
    static {
            equipmentList = readEquip.readData();
            if (equipmentList==null)
                equipmentList=new ArrayList<>();
    }

    public void addEquip(Equipment equipment){
        equipmentList.add(equipment);
        readEquip.writeData(equipmentList);
    }
    public void removeEquip(int index){
        equipmentList.remove(index);
        readEquip.writeData(equipmentList);
    }
    public void setEquip(int index, Equipment element){
        equipmentList.set(index,element);
        readEquip.writeData(equipmentList);
    }
}
