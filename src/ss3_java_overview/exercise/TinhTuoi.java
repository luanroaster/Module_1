package ss3_java_overview.exercise;

import java.util.Scanner;
import java.time.Year;
public class TinhTuoi {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nam sinh cua ban: ");
        int YearBirthday = scanner.nextInt();
        int YearNow = Year.now().getValue();
        System.out.println("Tuoi cua ban la" );
        System.out.print(YearNow - YearBirthday);

    }
}
