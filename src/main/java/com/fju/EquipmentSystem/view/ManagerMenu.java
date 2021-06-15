package com.fju.EquipmentSystem.view;
import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class ManagerMenu extends JFrame  {

    public static void main(String[] args) {
        JFrame frame = new JFrame("登山社裝備租借系統-社幹");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("Hello! "+ panel.getName()+"  歡迎使用山社的裝備管理系統");

        userLabel.setBounds(100,20,300,25);
        panel.add(userLabel);

        JButton findButton = new JButton("1. 查看裝備資訊");
        findButton.setBounds(120, 80, 150, 35);
        panel.add(findButton);

        JButton addButton = new JButton("2. 新增裝備資訊");
        addButton.setBounds(120, 140, 150, 35);
        panel.add(addButton);

        JButton delButton = new JButton("3. 刪除裝備資訊 ");
        delButton.setBounds(120, 200, 150, 35);
        panel.add(delButton);

        JButton displayButton = new JButton("4. 列印裝備列表");
        displayButton.setBounds(120, 260, 150, 35);
        panel.add(displayButton);

    }

}

