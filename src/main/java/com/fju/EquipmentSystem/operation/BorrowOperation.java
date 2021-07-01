package com.fju.EquipmentSystem.operation;

import com.fju.EquipmentSystem.Equipment;
import com.fju.EquipmentSystem.EquipmentList;
import java.util.Scanner;

public class BorrowOperation implements IOperation {
    @Override
    public void work(EquipmentList equipmentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("租借裝備");
        System.out.println("請輸入要租借的裝備的名稱(編號.名稱): ");
        String name = scanner.next();
        // 找到指定裝備的位置
        int i = 0;
        for (; i < equipmentList.getSize(); i++) {
            if (equipmentList.getEquipment(i).getName().equals(name)) {
                break;
            }
        }
        if (i >= equipmentList.getSize()) {
            // 沒找到
            System.out.println("未找到指定的裝備, 無法租借!");
            return;
        }
        //判斷當前這個裝備是否已被租借
        Equipment currentEquipment = equipmentList.getEquipment(i);
        if (currentEquipment.isBorrowed()) {
            // 若已被租借便不能繼續租借
            System.out.println("該裝備已被借出!");
            return;
        }
        equipmentList.getEquipment(i).setBorrowed(true);
        System.out.println("租借成功! 請將此畫面截圖! 記得聯絡社產約定領取時間以及付租金呦! ");
        System.out.println("租借裝備為: "+equipmentList.getEquipment(i).getName());
        System.out.println("租金為:" +equipmentList.getEquipment(i).getPrice());
    }

}
