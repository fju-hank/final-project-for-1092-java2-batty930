package com.fju.EquipmentSystem;

import com.fju.EquipmentSystem.operation.*;
import java.util.Scanner;

public class Manager extends User {
    public Manager(String name) {
        this.name = name;
        this.operations = new IOperation[] {
                new FindOperation(),
                new AddOperation(),
                new DeleteOperation(),
                new DisplayOperation(),
                new ExitOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=========================");
        System.out.println("Hello! " + name + ", 歡迎使用山社的裝備管理系統");
        System.out.println(" 1. 查看裝備資訊");
        System.out.println(" 2. 新增裝備資訊");
        System.out.println(" 3. 刪除裝備資訊");
        System.out.println(" 4. 列印裝備列表");
        System.out.println(" 5. 退出系統");
        System.out.println("=========================");
        System.out.println("請輸入您的選擇: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}

