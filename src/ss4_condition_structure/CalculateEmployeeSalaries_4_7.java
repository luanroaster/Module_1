package ss4_condition_structure;

import java.util.Scanner;

public class CalculateEmployeeSalaries_4_7

{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao Tham Nien Cong Tac (TNCT): ");
        int tnct = scanner.nextInt();

            if (tnct < 12){
               double heSo = 1.92;
               double LCB = 650000;
               double Luong = heSo * LCB;
                System.out.println("Luong ban nhan duoc la: "+Luong);

            } else if (12<= tnct && tnct <= 36) {
                double heSo = 2.34;
                int LCB = 650000;
                double Luong = heSo * LCB;
                System.out.println("Luong ban nhan duoc la: "+Luong);


            } else if (36<= tnct && tnct <= 60) {
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
