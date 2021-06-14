package com.fju.EquipmentSystem.operation;

import com.fju.EquipmentSystem.EquipmentList;
import java.util.Scanner;

public class DeleteOperation implements IOperation {
    @Override
    public void work(EquipmentList equipmentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("刪除裝備");
        System.out.println("請輸入要刪除的裝備的名字(編號.名稱): ");
        String name = scanner.next();
        int i = 0;
        for (; i < equipmentList.getSize(); i++) {
            if (name.equals(equipmentList.getEquipment(i).getName())) {
                break;
            }
        }
        if (i >= equipmentList.getSize()) {
            // 沒找到匹配名字的裝備, 刪除失敗
            System.out.println("您輸入的裝備 [" + name + "] 沒在系統中找到! 執行失敗!");
            return;
        }
        // 如果找到了匹配的名字, 就把 i 位置的元素給刪除掉
        if (i == equipmentList.getSize() - 1) {
            // 如果當前要刪除的元素正好是陣列的最後一個元素, 直接 size-1
            equipmentList.setSize(equipmentList.getSize() - 1);
            System.out.println("刪除成功");
            return;
        }
        // 如果要是需要刪中間的，要先把最後一個元素給值到要刪除的元素位置,
        equipmentList.setEquipment(i, equipmentList.getEquipment(equipmentList.getSize() - 1));
        // 再刪除最後一個元素
        equipmentList.setSize(equipmentList.getSize() - 1);
        System.out.println("刪除成功");
    }

}
