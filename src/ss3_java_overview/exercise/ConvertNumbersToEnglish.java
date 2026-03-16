package ss3_java_overview.exercise;

import java.util.Scanner;

public class ConvertNumbersToEnglish
{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao 1 so tu nhien tu 1 den 10:");
        int sotn = scanner.nextInt();

//        if(sotn == 1){
//            System.out.println("one");
//        } else if (sotn == 2) {
//            System.out.println("two");
//
//        }else if (sotn == 3) {
//            System.out.println("Three");
//
//        }else if (sotn == 4) {
//            System.out.println("four");
//
//        }else if (sotn == 5) {
//            System.out.println("five");
//
//        }else if (sotn == 6) {
//            System.out.println("six");
//
//        }else if (sotn == 7) {
//            System.out.println("seven");
//
//        }else if (sotn == 8) {
//            System.out.println("eight");
//
//        }else if (sotn == 9) {
//            System.out.println("nine");
//
//        }else if (sotn == 10) {
//            System.out.println("ten");
//
//        }else{
//            System.out.println("So khong hop le vui long nhap lai!");
//        }
        switch (sotn){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            default:
                System.out.println("So khong hop le vui long nhap lai!");
        }
    }


}
