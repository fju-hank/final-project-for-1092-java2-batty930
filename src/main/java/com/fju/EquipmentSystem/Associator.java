package com.fju.EquipmentSystem;
import com.fju.EquipmentSystem.operation.*;
import java.util.Scanner;

public class Associator extends User {

    public Associator(String name) {
        this.name = name;
        this.operations = new IOperation[] {
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
                new ExitOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=========================");
        System.out.println("Hello! " + name + ", 歡迎使用山社的裝備管理系統");
        System.out.println("以下是我們的規範：" );
        System.out.println("租借時間：另與社產約定。");
                System.out.println("租借流程：");
                        System.out.println("1.租借填寫→填寫後主動聯絡社產 2.與社產確認租金→約定領取時間 3.付租金、領取裝備 4.聯絡社產→約定還裝時間繳回裝備");
                                System.out.println("租借規定：");
                                        System.out.println("1.所有租借裝備事宜統一由社產管理。 " +
                                                "2.任何人不得在沒有社產的允許下，私自進入倉庫拿取裝備。 " +
                                                "3.無論是社團出隊或是個人租借，與社產拿取裝備之當下就得付租費，不得欠款。 " +
                                                "4.無論是社團出隊或是個人租借，都須在活動結束後的一個禮拜內歸還(除非有狀況)。 " +
                                                "5.約好時間後不可放鳥社產，違者將剝奪該次裝備租借之資格。 " +
                                                "6.若未在約定時間歸還裝備，延遲歸還一日將酌收20元罰金，以此類推。");
                                                System.out.println(" 1. 查看裝備資訊");
        System.out.println(" 2. 租借裝備");
        System.out.println(" 3. 歸還裝備");
        System.out.println(" 4. 退出系統");
        System.out.println("=========================");
        System.out.println("請輸入您的選擇: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
