package ss3_java_overview.exercise;

import static java.lang.Math.min;
import static java.lang.Math.sqrt;

public class ConditionsAndBranching

{

    public static char convert (char ch){
        if (ch>= 'a' && ch <= 'z'){
            return (char) (ch-32) ;
        }
        if (ch>= 'A' && ch <= 'Z' ){
            return (char) (ch + 32);
        }
        return ch;
    }

    public static double FirstDegreeEquation( double a , double b){
        if(a == 0){
            if (b==0){
                System.out.println("Phuong Trinh Vo Nghiem");
            }else {
                System.out.println("Phuong trinh vo nghiem");
            }

        }else {
            System.out.println("x = "+(-b/a));
        }
        return a;
    }
    public static int SecondDegreeEquation(int a, int b, int c){
        if (a == 0 ){
            System.out.println("tu giai phuong trinh bac 1 nhe");
        }else {
            int delta;

            delta = (b * b) - 4 * a * c;

            if (delta < 0){
                System.out.println("Phuong Trinh Vo Nghiem delta = " +delta);
            } else if (delta == 0) {
                int x;

                x = -b/2*a;

                System.out.println("Phuong trinh co 1 nghiem duy nhat x = " +x);
            }else {
                int x1,x2;

                x1 = (int) (-b-sqrt(delta))/(2*a);
                x2 = (int) (-b+sqrt(delta))/(2*a);

                System.out.println("Phuong trinh co nghiep x1 =" +x1);
                System.out.println("Phuong trinh co nghiep x2 =" +x2);
            }
        }
        return a;
    }

    public static int Min(int a, int b, int c, int d){
        int Max;

        Max = Math.max(a,b);
        Max = Math.max(Max,c);
        Max = Math.max(Max,d);

        return Max;
    }
    static void main(String[] args) {
        System.out.println(convert('B'));
        FirstDegreeEquation(2,3);
        SecondDegreeEquation(2,3,4);
        System.out.println(Min (2,3,4,5));
    }
}
