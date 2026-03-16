package ss3_java_overview.exercise;

import java.util.Scanner;

public class PrintOddNumberSequence

{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n");
        int n = scanner.nextInt();

//        for (int i = 0 ; i <= n ; i+=2){
//            System.out.println(i+1);
//        }

        for (int i = 0 ; i <= n; i ++){
            if (i%2==0){
                System.out.println(i+1);
            }
        }
}}
