package com.fju.EquipmentSystem.operation;

import com.fju.EquipmentSystem.Equipment;
import com.fju.EquipmentSystem.EquipmentList;
// 把所有裝備列表中的所有資訊都印出來
public class DisplayOperation implements IOperation {
    @Override
    public void work(EquipmentList equipmentList) {
        System.out.println("顯示裝備列表");
        for (int i = 0; i < equipmentList.getSize(); i++) {
            System.out.println(equipmentList.getEquipment(i));
        }
    }

}
