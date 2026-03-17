package ss5_iterative_structure1;

import java.util.Scanner;

public class PrintOddNumberSequence_5_8

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
