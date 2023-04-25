package Ngay21_04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice = -1;
        do{
            System.out.println("----MENU----");
            System.out.println("1.Giải pt bậc 1");
            System.out.println("2.Giải pt bậc 2");
            System.out.println("0. Thoát");
            System.out.println("Mời nhập lựa chọn");
            try {
                choice= Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Mời nhập số");
            }
           switch (choice){
               case 1:
                   break;
               case 2:
                   break;
               case 0:
                   break;
               default:
                   System.out.println("Không có lệnh trên");
           }
        }while (choice!=0);
    }
}
