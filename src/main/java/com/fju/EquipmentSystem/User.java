package com.fju.EquipmentSystem;

import com.fju.EquipmentSystem.operation.IOperation;

// 使用抽象方法User來存放兩Manager 和 Associator的資訊, 再由該類的子類來進一步的重寫這樣的方法

abstract public class User {
    protected String name;
    protected IOperation[] operations;

    public abstract int menu();

    public void doOperation(int choice, EquipmentList equipmentList) {
        IOperation operation = this.operations[choice - 1];
        // 再呼叫 work 方法,執行引用對應的子類的方法
        operation.work(equipmentList);
    }
}

