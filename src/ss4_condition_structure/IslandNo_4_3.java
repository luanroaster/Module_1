package ss4_condition_structure;

import java.util.Scanner;

public class IslandNo_4_3
{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tu nhien a:");
        int a = scanner.nextInt();

        System.out.println("Nhap so tu nhien b:");
        int b = scanner.nextInt();

        int temp;
        int c = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.println("so sau khi Dao la");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
