package ss3_java_overview.exercise;

import java.util.Scanner;

class PrinYinAndYang {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap N");
        int n = scanner.nextInt();

//        for (int i =2 ; i<=n ; i+=2){
//            if (i%4==0){
//                System.out.println(-i);
//            }else {
//                System.out.println(i);
//            }


        for (int i = 2; i <= n ; i+=2){
            if (i%6==0){
                System.out.println(-i);
            }else {
                System.out.println(i);
            }
        }
    }
}
