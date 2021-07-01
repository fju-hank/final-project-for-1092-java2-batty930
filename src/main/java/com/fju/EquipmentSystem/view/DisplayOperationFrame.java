package com.fju.EquipmentSystem.view;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class DisplayOperationFrame extends JFrame{

    public static void main(String[] args) {
        JFrame frame = new JFrame("裝備資訊清單");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        String[] columnNames = {"編號", "名稱", "天數", "價錢", "類型"};

        Object[][] rowData = {
                {1, "1.帳篷(含營釘、營繩)","4天(含)以下",200,"住"},
                {2, "1.帳篷(含營釘、營繩)","5天-10天",250,"住"},
                {3, "1.帳篷(含營釘、營繩)","11天-30天",350,"住"},
                {4, "1.天幕","4天(含)以下",50,"住"},
                {5, "1.天幕","5天-10天",100,"住"},
                {6, "1.天幕","11天-30天",150,"住"},
                {7, "1.地布","4天(含)以下",50,"住"},
                {8, "1.地布","5天-10天",100,"住"},
                {9, "1.地布","11天-30天",150,"住"},
                {10, "1.鍋具","4天(含)以下",50,"食"},
                {11, "1.鍋具","5天-10天",100,"食"},
                {12, "1.鍋具","11天-30天",200,"食"},
                {13, "1.爐頭","4天(含)以下",50,"食"},
                {14, "1.爐頭","5天-10天",100,"食"},
                {15, "1.爐頭","11天-30天",200,"食"},
                {16, "1.瓦斯罐","4天(含)以下",80,"食"},
                {17, "1.擋風板","4天(含)以下",20,"食"},
                {18, "1.擋風板","5天-10天",40,"食"},
                {19, "1.擋風板","11天-30天",60,"食"},
                {20, "1.水袋","4天(含)以下",50,"食"},
                {21, "1.水袋","5天-10天",100,"食"},
                {22, "1.水袋","11天-30天",200,"食"},
                {23, "1.濾水器","4天(含)以下",50,"食"},
                {24, "1.濾水器","5天-10天",100,"食"},
                {25, "1.濾水器","11天-30天",200,"食"},
                {26, "1.開山刀","4天(含)以下",50,"行"},
                {27, "1.開山刀","5天-10天",100,"行"},
                {28, "1.開山刀","11天-30天",200,"行"},
                {29, "1.登山包","4天(含)以下",100,"私"},
                {30, "1.登山包","5天-10天",150,"私"},
                {31, "1.登山包","11天-30天",250,"私"},
                {32, "1.睡袋","4天(含)以下",50,"私"},
                {33, "1.睡袋","5天-10天",100,"私"},
                {34, "1.睡袋","11天-30天",200,"私"},
                {35, "1.睡墊","4天(含)以下",10,"私"},
                {36, "1.睡墊","5天-10天",20,"私"},
                {37, "1.睡墊","11天-30天",40,"私"},
                {38, "1.防寒外套","4天(含)以下",50,"私"},
                {39, "1.防寒外套","5天-10天",100,"私"},
                {40, "1.防寒外套","11天-30天",200,"私"},
                {41, "1.頭燈","4天(含)以下",50,"私"},
                {42, "1.頭燈","5天-10天",100,"私"},
                {43, "1.頭燈","11天-30天",200,"私"},
        };

        JTable table = new JTable(rowData, columnNames);

        table.setForeground(Color.BLACK);
        table.setFont(new Font(null, Font.PLAIN, 14));
        table.setSelectionForeground(Color.DARK_GRAY);
        table.setSelectionBackground(Color.LIGHT_GRAY);
        table.setGridColor(Color.GRAY);

        table.getTableHeader().setFont(new Font(null, Font.BOLD, 14));
        table.getTableHeader().setForeground(Color.ORANGE);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);

        table.setRowHeight(35);
        table.getColumnModel().getColumn(0).setPreferredWidth(5);
        table.getColumnModel().getColumn(1).setPreferredWidth(80);
        table.getColumnModel().getColumn(3).setPreferredWidth(5);
        table.getColumnModel().getColumn(4).setPreferredWidth(5);
        table.setPreferredScrollableViewportSize(new Dimension(500, 400));

        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane);

    }

}
