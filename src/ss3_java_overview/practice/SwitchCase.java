package ss3_java_overview.practice;

import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so ban muon");
        int day = scanner.nextInt();

        switch (day){
            case 2:
                System.out.println("Thu 2 ");break;
            case 3:
                System.out.println("Thu 3 ");break;
            case 4:
                System.out.println("Thu 4 ");break;
            case 5:
                System.out.println("Thu 5 ");break;
            case 6:
                System.out.println("Thu 6 ");break;
            case 7:
                System.out.println("Thu 7 ");break;
            case 8:
                System.out.println("Thu CN ");break;
            default:
                System.out.println("so khong hop le"); break;
        }

    }
}
