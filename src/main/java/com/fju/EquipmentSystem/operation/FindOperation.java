package com.fju.EquipmentSystem.operation;

import com.fju.EquipmentSystem.EquipmentList;
import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void work(EquipmentList equipmentList) {
        // 實現查詢某個裝備的資訊
        System.out.println("查詢裝備");
        // 讓使用者輸入裝備名, 來進行查詢
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入要查詢的裝備名(編號.名稱): ");
        String name = scanner.next();
        // 迴圈遍歷裝備列表
        for (int i = 0; i < equipmentList.getSize(); i++) {
            if(equipmentList.getEquipment(i).getName().contains(name)) {
                System.out.println(equipmentList.getEquipment(i));
            }
        }
    }
}
