package com.fju.EquipmentSystem.view;

import com.fju.EquipmentSystem.Associator;
import com.fju.EquipmentSystem.Manager;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class StartGUI extends JFrame  {

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

        JButton loginmanagerButton = new JButton("幹部");
        loginmanagerButton.setBounds(100, 50, 80, 25);
        panel.add(loginmanagerButton);

        JButton loginassociatorButton = new JButton("社員");
        loginassociatorButton.setBounds(200, 50, 80, 25);
        panel.add(loginassociatorButton);

    }

}
