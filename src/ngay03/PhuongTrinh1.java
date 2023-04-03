package ngay03;

import java.util.Scanner;

public class PhuongTrinh1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so a: ");
        int a = scanner.nextInt();
        System.out.println("Moi nhap so b: ");
        int b = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT vo so nghiem:");
            } else {
                System.out.println("PT vo nghiem:");
            }
        } else {
            double x = (double) -b / a;
            System.out.println("PT co nghiem la: " + x);
        }
    }
}
