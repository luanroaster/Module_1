package ss3_java_overview.exercise;

import java.util.Scanner;

public class Circular_3_5 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ban kinh duong tron: ");
        int banKinh = scanner.nextInt();

        double pi = 3.14444;

        double chuvi =  2 * pi * banKinh;
        double dienTich = pi * (banKinh*banKinh);

        System.out.println("Ban kinh hinh tron la: " +chuvi);
        System.out.println("Dien tich hinh tron la: "+dienTich);


    }
}
