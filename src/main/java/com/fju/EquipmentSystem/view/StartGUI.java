package com.fju.EquipmentSystem.view;

import com.fju.EquipmentSystem.Associator;
import com.fju.EquipmentSystem.Manager;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class StartGUI extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("登山社裝備租借系統");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);


        JLabel userLabel = new JLabel("您的姓名:");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel identityLabel = new JLabel("您的角色");
        identityLabel.setBounds(10,50,80,25);
        panel.add(identityLabel);

        JRadioButton managerButton = new JRadioButton("幹部");
        JRadioButton associatorButton = new JRadioButton("社員");
        ButtonGroup roleButton = new ButtonGroup();
        roleButton.add(managerButton);
        managerButton.setBounds(100,50,80,25);
        roleButton.add(associatorButton);
        associatorButton.setBounds(200,50,80,25);
        managerButton.setSelected(true);
        panel.add(managerButton);
        panel.add(associatorButton);

        JButton sureButton = new JButton("確認");
        sureButton.setBounds(80, 100, 80, 25);
        panel.add(sureButton);


        JButton returnButton = new JButton("返回");
        returnButton.setBounds(190, 100, 80, 25);
        panel.add(returnButton);


    }

}
