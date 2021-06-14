package com.fju.EquipmentSystem.operation;

import com.fju.EquipmentSystem.EquipmentList;

public class ExitOperation implements IOperation {
    @Override
    public void work(EquipmentList equipmentList) {
        System.out.println("退出程式");
        System.exit(0);
    }
}
