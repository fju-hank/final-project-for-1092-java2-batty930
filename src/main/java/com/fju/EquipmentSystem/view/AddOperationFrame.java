package com.fju.EquipmentSystem.view;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class AddOperationFrame extends JFrame {


    public static void main(String[] args) {
        JFrame frame = new JFrame("新增裝備資訊");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("新增裝備名稱(編號.名稱):");
        userLabel.setBounds(10, 20, 200, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(200, 20, 200, 25);
        panel.add(userText);

        JLabel daysLabel = new JLabel("新增裝備的天數:");
        daysLabel.setBounds(10, 55, 200, 25);
        panel.add(daysLabel);

        JComboBox days = new JComboBox();
        days.addItem("4天(含)以下");
        days.addItem("5天 - 10天");
        days.addItem("11天 - 30天");
        days.setBounds(200,55,165,25);
        panel.add(days);

        JLabel priceLabel = new JLabel("裝備的價格:");
        priceLabel.setBounds(10, 90, 200, 25);
        panel.add(priceLabel);

        JTextField priceText = new JTextField(20);
        priceText.setBounds(200, 90, 200, 25);
        panel.add(priceText);

        JLabel typeLabel = new JLabel("裝備的價格:");
        typeLabel.setBounds(10, 125, 200, 25);
        panel.add(typeLabel);

        JComboBox type = new JComboBox();
        type.addItem("住");
        type.addItem("食");
        type.addItem("行");
        type.addItem("私");
        type.setBounds(200, 125, 200, 25);
        panel.add(type);


        JButton sureButton = new JButton("確認");
        sureButton.setBounds(250, 165, 80, 25);
        panel.add(sureButton);

    }



}