package ss3_java_overview.exercise;

import java.util.Scanner;

public class ChargingAndTaxes_3_3
{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap Ten San Pham");
        String namesproduct = scanner.nextLine();

        System.out.println("Nhap So Luong");
        double quantity = scanner.nextInt();
        System.out.println("Nhap Don Gia");
        double price = scanner.nextInt();

        double totalmoney = quantity * price;
        double thue = totalmoney * 0.10;

        System.out.println("Thanh Tien = "+totalmoney);
        System.out.println("VAT = "+ thue);
    }
}
