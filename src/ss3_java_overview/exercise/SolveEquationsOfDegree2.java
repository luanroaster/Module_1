package ss3_java_overview.exercise;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class SolveEquationsOfDegree2{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap he so a:");
        int a = scanner.nextInt();
        System.out.println("Nhap vao he so b:");
        int b = scanner.nextInt();
        System.out.println("Nhap vao he so c:");
        int c = scanner.nextInt();

        if (a == 0 ){
            System.out.println("tu giai phuong trinh bac 1 nhe");
        }else {
            int delta;
            delta = (b * b) - 4 * a * c;
            if (delta < 0){
                System.out.println("Phuong Trinh Vo Nghiem delta = " +delta);
            } else if (delta == 0) {
                int x;
                x = -b/2*a;
                System.out.println("Phuong trinh co 1 nghiem duy nhat x = " +x);
            }else {
                int x1,x2;
                x1 = (int) (-b-sqrt(delta))/(2*a);
                x2 = (int) (-b+sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co nghiep x1 =" +x1);
                System.out.println("Phuong trinh co nghiep x2 =" +x2);
            }
        }
    }
}
