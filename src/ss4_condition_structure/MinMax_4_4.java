package ss4_condition_structure;

import java.util.Scanner;

public class MinMax_4_4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so nguyen a:");
        int a = scanner.nextInt();

        System.out.println("Nhap vao so nguyen b");
        int b = scanner.nextInt();

        int Max;

        Max = a>b?a:b;
        System.out.println("Max = "+Max);

        int Min;

        Min= a<b?a:b;
        System.out.println("Min = "+Min);
    }

}
