package controller;

import model.equipment.Equipment;
import model.user.Survival;
import storage.equipment.IReadWriteEquipment;
import storage.equipment.ReadWriteFile;
import storage.user.IReadWriteSurvival;
import storage.user.ReadWriteSurvival;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Admin implements Serializable {
    public static double coin = 9999999;
    private static IReadWriteEquipment readWriteEquipment = ReadWriteFile.getInstance();
    private static IReadWriteSurvival readWriteSurvival = ReadWriteSurvival.getInstance();
    public static List<Equipment> equipmentList;
    static {
            equipmentList = readWriteEquipment.readData();
            if (equipmentList==null)
                equipmentList=new ArrayList<>();
    }

    public static  List<Survival> survivalList;
    static {
        survivalList = readWriteSurvival.readData();
        if (survivalList==null)
            survivalList=new ArrayList<>();
    }

    public static double getCoin() {
        return coin;
    }

    public static void setCoin(double coin) {
        Admin.coin = coin;
    }

    public void addEquip(Equipment equipment){
        equipmentList.add(equipment);
        readWriteEquipment.writeData(equipmentList);
    }
    public void removeEquip(int index){
        equipmentList.remove(index);
        readWriteEquipment.writeData(equipmentList);
    }
    public void setEquip(int index,String name){
        equipmentList.get(index).setName(name);
//        equipmentList.set(index,element);
        readWriteEquipment.writeData(equipmentList);
    }
    public void addSurvival(Survival survival){
        survivalList.add(survival);
        readWriteSurvival.writeData(survivalList);
    }
    public boolean checkSurvival(String code){
        for (Survival sv:survivalList
             ) {
            if (code.equalsIgnoreCase(sv.getCode())){
                return true;
            }
        }
        return false;
    }
}
