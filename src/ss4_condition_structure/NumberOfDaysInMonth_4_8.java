package ss4_condition_structure;

import java.util.Scanner;

public class NumberOfDaysInMonth_4_8

{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao thang:");
        int thang = scanner.nextInt();
        System.out.println("Nhap vao nam: ");
        int nam = scanner.nextInt();

        switch (thang){
            case 2: if (nam % 400 == 0){
                System.out.println("So ngay thang "+thang+" nam "+nam+ " la 29");
            }else{
                System.out.println("so ngay thang "+thang+" nam "+nam+" la 28");
            }break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("So ngay thang " +thang+" nam "+nam+ " la 30 ngay "); break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("So ngay thang"+thang+" nam "+nam+ " la 31 ngay") ;break;
            default:
                System.out.println("So thang nhap khong hop le, vui long nhap lai: ");
                break;

        }
    }
}
