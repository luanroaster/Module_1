package ss3_java_overview.exercise;

import java.util.Scanner;

public class PrintSeries {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao n");
        int n = scanner.nextInt();

        for(int i = 0 ; i < n ;i ++){
            System.out.println(i+1);

        }
    }
}
