package ss4_condition_structure;

import java.util.Scanner;

public class SolveEquationsOfDegree1_4_5
        {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so a: ");
        int a = scanner.nextInt();

        System.out.println("Nhap vao so b");
        int b = scanner.nextInt();

        if (a == 0){
            if (b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }
            if (b !=  0 ){
                System.out.println("Phuong trinh vo nghiem");
            }
        }else {
            int x;
            x = -b/a;

            System.out.println("x = "+x);

        }
    }
}
