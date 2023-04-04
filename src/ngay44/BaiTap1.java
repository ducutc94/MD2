package ngay44;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] students = {"Duong", "Dung", "Thai", "Lam", "Khac Chu"};
        boolean isExit=true;
        System.out.println("NHap ten:");
        String nhap=scanner.nextLine();
        System.out.println(nhap);
        for (String student : students) {
            if(nhap.equals(student)){
                System.out.println(student);
                isExit=false;
                break;
            }
        }if(isExit){
            System.out.println("Khong co hoc sinh nao.");
        }
    }
}
