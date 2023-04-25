package Ngay21_04;

import java.util.Scanner;

public class NgoaiLe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=0;
        try {
            System.out.println("Nhập vào số nguyên n: ");
            n=scanner.nextInt();
        }catch (Exception e){
            System.err.println("Nhập dữ liệu không đúng.");
        }

        System.out.println("Giá trị nhập là: "+ n);
        System.out.println("kêt thúc: ");
    }
}
