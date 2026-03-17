package ss5_iterative_structure1;

import java.util.Scanner;

public class PrintSeries_5_1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao n");
        int n = scanner.nextInt();

        for(int i = 0 ; i < n ;i ++){
            System.out.println(i+1);

        }
    }
}
