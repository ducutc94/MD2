package Ngay54;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu rong: ");
        double width = scanner.nextDouble();
        System.out.println("Nhap vao chieu dai: ");
        double height = scanner.nextDouble();
        HinhChuNhat ractangle = new HinhChuNhat(width, height);
        ractangle.setHeight(60);
        System.out.println(ractangle.getHeight());
        System.out.println(ractangle.display());
        System.out.println(ractangle.getArea());
        System.out.println(ractangle.getPerimeter());

    }
}
