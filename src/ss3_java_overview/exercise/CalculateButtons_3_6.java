package ss3_java_overview.exercise;

import java.util.Scanner;

public class CalculateButtons_3_6

{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap bien so xe cua ban");
        int soxe = scanner.nextInt();

        int soa = soxe / 10000;
        int sob = soxe /1000;
        int soc = soxe / 100;
        int sod = soxe / 10;
        int soe = soxe / 1;

        int sum = (soa + sob + soc + sod + soe)%10;

        System.out.println(" Tong cua bien so xe ban la: "+sum);
    }
}
