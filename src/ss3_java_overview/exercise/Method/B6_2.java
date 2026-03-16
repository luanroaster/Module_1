package ss3_java_overview.exercise.Method;

import java.util.Scanner;

public class B6_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        System.out.println("So dao: " + reverseNumber(n));
        System.out.println("Doi xung: " + isSymmetricalNumber(n));
        System.out.println("So chinh phuong: " + isSquareNumber(n));
        System.out.println("So nguyen to: " + isPrimeNumber(n));
        System.out.println("So le: " + calculateTotalOddDigits(n));
        System.out.println("Tong so nguyen to: " + calculateTotalOddDigits(n));
        System.out.println("Tong so chinh phuong: " + calculateTotalSquareDigits(n));
    }

    //a
    public static int reverseNumber(int n){
        int revert = 0;
        while(n > 0){
            revert = revert * 10 + n % 10;
            n = n/10;
        }
        return revert;
    }
    //b
    public static boolean isSymmetricalNumber(int n){
        return n == reverseNumber(n);
    }
    //c
    public static boolean isSquareNumber(int n){
        int k = (int) Math.sqrt(n);
        return k * k == n;
    }
    //d
    public static boolean isPrimeNumber(int n) {
        if (n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    //e
    public static int calculateTotalOddDigits(int n) {
        int s = 0;
        for (int i = n; i > 0; i /= 10) {
            int digit = i % 10;
            if (digit % 2 != 0){
                s += digit;
            }
        }
        return s;
    }
    //f
    public static int calculateTotalPrimeDigits(int n){
        int s = 0;
        for(int i = n; i > 0; i /= 10){
            int digit = i % 10;
            if(digit == 2 || digit == 3 || digit == 5 || digit == 7){
                s += digit;
            }
        }
        return s;
    }
    //g
    public static int calculateTotalSquareDigits(int n){
        int s = 0;
        for ( int i = n; i > 0; i /= 10){
            int digit = i % 10;
            if(digit == 1 || digit == 4 || digit == 9){
                s += digit;
            }
        }
        return s;
    }
}
