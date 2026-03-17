package ss3_java_overview.exercise;

import java.util.Scanner;

public class AverageScore_3_4
{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap diem toan");
        int Toan =scanner.nextInt();

        System.out.print("Nhap diem ly");
        int Ly = scanner.nextInt();

        System.out.print("nhap diem hoa");
        int Hoa = scanner.nextInt();

        int DTB = (Toan+Ly+Hoa)/3;
        System.out.println("DTB = "+ DTB);
    }
}
