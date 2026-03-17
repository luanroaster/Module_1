package ss3_java_overview.exercise;

import java.util.Scanner;

public class PrintTheBoxWithAnAsterisk

        {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Nhao vao hang: ");
        int row = scanner.nextInt();

        System.out.println("Nhap vao cot: ");
        int colum = scanner.nextInt();

        for (int i = 1; i<= colum ; i++){
            for (int j = 1; j <= row; j++){
                if (j<=i ){
                    System.out.println("* ");
                }else {
                    System.out.println(" ");
                }
            }
        }
        System.out.println();

    }
}
