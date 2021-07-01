package com.fju.EquipmentSystem.view;
import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class AssociatorMenu extends JFrame  {

    public static void main(String[] args) {
        JFrame frame = new JFrame("登山社裝備租借系統-社員");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("Hello! "+ panel.getName()+"  歡迎使用山社的裝備管理系統");
        userLabel.setBounds(250,20,300,25);
        panel.add(userLabel);

       JLabel ruleLabel = new JLabel("以下是我們的規範： " );
        ruleLabel.setBounds(50,40,600,15);
        panel.add(ruleLabel);

        JLabel rule1Label = new JLabel(
                "租借時間：另與社產約定。 "  +
                     "租借流程：" +
                     "1. 租借填寫→填寫後主動聯絡社產 " );
        rule1Label.setBounds(50,55,700,15);
        panel.add(rule1Label);

        JLabel rule2Label = new JLabel(
                "2. 與社產確認租金→約定領取時間 " +
                     "3. 付租金、領取裝備 " +
                     "4. 聯絡社產→約定還裝時間繳回裝備" );
        rule2Label.setBounds(50,70,700,15);
        panel.add(rule2Label);

        JLabel rule3Label = new JLabel(
                "租借規定：" +
                    "1. 所有租借裝備事宜統一由社產管理。" +
                    "2. 任何人不得在沒有社產的允許下，私自進入倉庫拿取裝備。"  );
        rule3Label.setBounds(50,85,700,15);
        panel.add(rule3Label);

        JLabel rule4Label = new JLabel(
                "3. 無論是社團出隊或是個人租借，與社產拿取裝備之當下就得付租費，不得欠款。" +
                     "4. 須在活動結束後的一個禮拜內歸還。" );
        rule4Label.setBounds(50,100,700,15);
        panel.add(rule4Label);

        JLabel rule5Label = new JLabel(
                "5. 約好時間後不可放鳥社產，違者將剝奪該次裝備租借之資格。" +
                     "6. 若未在約定時間歸還裝備，延遲一日將酌收20元罰金。" );
        rule5Label.setBounds(50,115,700,15);
        panel.add(rule5Label);




        JButton findButton = new JButton("1. 查看裝備資訊");
        findButton.setBounds(300, 180, 150, 40);
        panel.add(findButton);

        JButton borrowButton = new JButton("2. 租借裝備");
        borrowButton.setBounds(300, 250, 150, 40);
        panel.add(borrowButton);

        JButton returnButton = new JButton("3. 歸還裝備 ");
        returnButton.setBounds(300, 320, 150, 40);
        panel.add(returnButton);


    }

}

