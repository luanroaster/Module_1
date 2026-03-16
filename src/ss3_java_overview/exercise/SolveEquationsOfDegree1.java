package ss3_java_overview.exercise;

import java.util.Scanner;

public class SolveEquationsOfDegree1

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
