package Ngay54.ptbac2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so thu a");
        int a = scanner.nextInt();
        System.out.println("Nhap he so thu b");
        int b = scanner.nextInt();
        System.out.println("Nhap he so thu c");
        int c = scanner.nextInt();
        PhuongTrinhBac2 p = new PhuongTrinhBac2(a, b, c);
        if (delta(p) == 0) {
            System.out.println(x(p));
        } else if (delta(p) > 0) {
            System.out.println("PT co nghiem la: " + "\n" + "x1= " + x1(p) + "\n" + "x2= " + x2(p));
        } else {
            System.out.println("PT vo nghiem");
        }
    }

    public static int delta(PhuongTrinhBac2 p) {
        return (p.b * p.b) - (4 * p.c * p.a);
    }

    public static double x1(PhuongTrinhBac2 p) {
        return (-p.b + Math.sqrt(Test.delta(p))) / 2 * p.a;
    }

    public static double x2(PhuongTrinhBac2 p) {
        return (-p.b - Math.sqrt(Test.delta(p))) / 2 * p.a;
    }

    public static double x(PhuongTrinhBac2 p) {
        int i = -p.b / 2 * p.a;
        return i;
       
    }
}
