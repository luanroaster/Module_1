package ss3_java_overview.exercise;

import java.util.Scanner;

public class Thue {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ten San Pham");
        String tenSP = scanner.nextLine();
        System.out.println("Nhap So Luong");
        int soLuong = scanner.nextInt();
        System.out.println("Nhap Don Gia");
        int donGia = scanner.nextInt();

        int tien = soLuong * donGia;
        double thue = tien * 0.10;

        System.out.println("Thanh Tien = "+tien);
        System.out.println("VAT = "+ thue);
    }
}
