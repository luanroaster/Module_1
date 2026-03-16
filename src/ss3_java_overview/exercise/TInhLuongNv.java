package ss3_java_overview.exercise;

import java.util.Scanner;

public class TInhLuongNv {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao Tham Nien Cong Tac (TNCT): ");
        int TNCT = scanner.nextInt();

            if (TNCT < 12){
               double heSo = 1.92;
               int LCB = 650000;
               double Luong = heSo * LCB;
                System.out.println("Luong ban nhan duoc la: "+Luong);

            } else if (12<= TNCT && TNCT <= 36) {
                double heSo = 2.34;
                int LCB = 650000;
                double Luong = heSo * LCB;
                System.out.println("Luong ban nhan duoc la: "+Luong);


            } else if (36<= TNCT && TNCT <= 60) {
                double heSo = 3;
                double LCB = 650000;
                double Luong = heSo * LCB;
                System.out.println("Luong ban nhan duoc la: "+Luong);

            }else {
                double heSo = 4.5;
                int LCB = 650000;
                double Luong = heSo * LCB;
                System.out.println("Luong ban nhan duoc la: "+Luong);
            }
    }
}
