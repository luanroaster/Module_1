package ss3_java_overview.practice;

import java.util.Scanner;

public class ScannerInfo2 {
    static void main(String[] args) {
//        //System.in la mot tieu chuan de nhan du lieu tu ban phim
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap 1 so: ");
//        int a = scanner.nextInt(); //neu muon nhap tu ban phim thi phai next+kieudulieu khaibao
//        System.out.print(+a);


        // muon luu ky tu thi String + tendulieu = Scanner.nextLine();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ten cua ban");
        String name = scanner.nextLine();
        System.out.println("Ten cua ban la: " +name);


        System.out.println("Nhap diem cua ban: ");
        double score = scanner.nextDouble();
        System.out.println("Diem cua ban la: " +score);


        //Neu muon nhap so truoc va chuoi string sau thi phai dung => kieudulieu + tendulieu = Kieudulieu.parse+kieudulieu(scanner.nextLine())
//vi du
        double Score1 = Double.parseDouble(scanner.nextLine());
    }
}
