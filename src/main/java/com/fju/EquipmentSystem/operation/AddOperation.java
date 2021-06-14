package com.fju.EquipmentSystem.operation;

import com.fju.EquipmentSystem.Equipment;
import com.fju.EquipmentSystem.EquipmentList;
import java.util.Scanner;


public class AddOperation implements IOperation{
    @Override
    public void work(EquipmentList equipmentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("新增裝備");
        System.out.println("請輸入新的裝備的名稱: ");
        String name = scanner.next();
        System.out.println("請輸入新的裝備的天數: ");
        String days = scanner.next();
        System.out.println("請輸入新的裝備的價格: ");
        double price = scanner.nextDouble();
        System.out.println("請輸入新的裝備的類別: ");
        String type = scanner.next();
        Equipment newEquipment = new Equipment(name, days, price, type);
        // 把這個新的裝備放到 EquipmentList 的末尾
        int currentSize = equipmentList.getSize();
        equipmentList.setEquipment(currentSize, newEquipment);
        equipmentList.setSize(currentSize + 1);
        System.out.println("新增裝備成功!");
    }
}
