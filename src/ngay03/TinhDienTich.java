package ngay03;

import java.util.Scanner;

public class TinhDienTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap n:");
        int n = scanner.nextInt();
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += (double) i/ (i+ 1);
        }
        System.out.println("Tong la:  " + s);
    }
}
