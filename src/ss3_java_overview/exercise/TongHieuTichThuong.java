package ss3_java_overview.exercise;

import java.util.Scanner;

public class TongHieuTichThuong {
    static void main(String[] args) {

        System.out.print("Nhap a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;

        System.out.println("Tong: " + tong);
        System.out.println("Hieu" + hieu);
        System.out.println("Tich" + tich);
        System.out.println("Thuong" + thuong);
    }
}
