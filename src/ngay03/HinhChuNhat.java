package ngay03;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao chieu dai:");
        int height=scanner.nextInt();
        System.out.println("Nhap vao chieu rong:");
        int width=scanner.nextInt();
        int rectangle=height*width;
        System.out.println("Dien tich la : "+rectangle+"m2");
    }
}
