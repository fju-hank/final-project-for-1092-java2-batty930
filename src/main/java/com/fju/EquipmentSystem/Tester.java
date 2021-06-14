package com.fju.EquipmentSystem;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        //準備好裝備的資料
        Object o = null;
        //建立使用者
        EquipmentList equipmentList = new EquipmentList();
        User user = login();

        //進入系統
        while (true) {
            int choice = user.menu();
            // 使用者輸入選擇後,根據選項來執行對應的操作
            user.doOperation(choice, equipmentList);
        }
    }

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入您的姓名: ");
        String name = scanner.next();
        System.out.println("請輸入您的角色: 1 幹部, 0 社員");
        int who = scanner.nextInt();
        if (who == 1) {
            return new Manager(name);
        }
        return new Associator(name);
    }
}
