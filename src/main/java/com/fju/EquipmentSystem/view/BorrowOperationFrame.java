package com.fju.EquipmentSystem.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;


public class BorrowOperationFrame extends JFrame {


    public static void main(String[] args) {
        JFrame frame = new JFrame("租借裝備資訊");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("租借裝備名稱(編號.名稱):");
        userLabel.setBounds(10, 20, 200, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(200, 20, 200, 25);
        panel.add(userText);


        JLabel daysLabel = new JLabel("選擇租借的天數:");
        daysLabel.setBounds(10, 55, 200, 25);
        panel.add(daysLabel);

        JComboBox days = new JComboBox();
        days.addItem("4天(含)以下");
        days.addItem("5天 - 10天");
        days.addItem("11天 - 30天");
        days.setBounds(200,55,165,25);
        panel.add(days);

        JButton sureButton = new JButton("確認");
        sureButton.setBounds(250, 165, 80, 25);
        panel.add(sureButton);
        sureButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "確定租借此裝備嗎?", "租借裝備", JOptionPane.OK_CANCEL_OPTION);
                if (sureButton.isEnabled()){
                    System.out.println("租借成功! 請將此畫面截圖! 記得聯絡社產約定領取時間以及付租金呦! ");  }
            }

        });

        JButton returnButton = new JButton("返回");
        returnButton.setBounds(140, 165, 80, 25);
        panel.add(returnButton);

    }



}