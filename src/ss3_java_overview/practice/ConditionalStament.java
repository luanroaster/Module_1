package ss3_java_overview.practice;

import java.util.Scanner;

public class ConditionalStament {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem cua ban ");
        double Score = scanner.nextDouble();

        if (Score < 5) {
            System.out.println("Yeu");
        } else if (Score >= 5 && Score <8) {
            System.out.println("Kha");
        } else {
            System.out.println("Tot");
        }
    }
}
