package com.fju.EquipmentSystem.view;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class DeleteOperationFrame extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("刪除裝備資訊");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("刪除裝備名稱(編號.名稱):");
        userLabel.setBounds(10, 20, 200, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(200, 20, 200, 25);
        panel.add(userText);

        JButton sureButton = new JButton("確認");
        sureButton.setBounds(250, 165, 80, 25);
        panel.add(sureButton);

    }

}
