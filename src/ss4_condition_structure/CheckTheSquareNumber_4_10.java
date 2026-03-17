package ss4_condition_structure;

import java.util.Scanner;

public class CheckTheSquareNumber_4_10
{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen duong x: ");
        double x = scanner.nextInt();

         x =  Math.sqrt(x);

         double squareRoot = x;
         if (squareRoot % 1 ==0 ){
             System.out.println("x la so chinh phuong!");
         } else{
             System.out.println("x khong la so chinh phuong!");
         }

    }
}
