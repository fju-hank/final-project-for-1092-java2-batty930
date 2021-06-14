package com.fju.EquipmentSystem.operation;

import com.fju.EquipmentSystem.Equipment;
import com.fju.EquipmentSystem.EquipmentList;
import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(EquipmentList equipmentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("歸還裝備");
        System.out.println("請輸入要還的裝備的名稱(編號.名稱): ");
        String name = scanner.next();
        int i = 0;
        for (; i < equipmentList.getSize(); i++) {
            Equipment equipment = equipmentList.getEquipment(i);
            if (equipment.getName().equals(name)) {
                break;
            }
        }
        if (i >= equipmentList.getSize()) {
            System.out.println("裝備沒有找到, 無法歸還!");
            return;
        }
        // 判定當前這個裝備是否是已被租借的狀態
        Equipment currentEquipment = equipmentList.getEquipment(i);
        if (!currentEquipment.isBorrowed()) {
            System.out.println("這個裝備沒有借出, 無法歸還!");
            return;
        }
        currentEquipment.setBorrowed(false);
        System.out.println("歸還成功! ");
        return;
    }

}
