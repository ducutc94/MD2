package ngay03;

import java.util.Scanner;

public class NhapThang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap Thang:");
        int month=scanner.nextInt();
        switch (month){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Thang co 31 ngay");
                break;
            case 7:
            case 11:
            case 8:
            case 9:
            case 10:
                System.out.println("Thang co 30");
                break;
            default:
                System.out.println("Nhap lai");
        }
    }
}
