package Ngay13_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBookManage phoneBookManage = new PhoneBookManage();
        do {
            System.out.println("s2---MENU---s2");
            System.out.println("1.Hiển Thị.");
            System.out.println("2.Thêm danh bạ.");
            System.out.println("3.Xóa danh bạ.");
            System.out.println("4.Sửa danh bạ.");
            System.out.println("5.Hiển Thị theo tên.");
            System.out.println("0. Thoát ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    phoneBookManage.display();
                    break;
                case 2:
                    phoneBookManage.insertPhone();
                    break;

                case 3:
                    phoneBookManage.removePhone();
                    break;
                case 4:
                    phoneBookManage.updatePhone();
                    break;
                case 5:
                    phoneBookManage.sort();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
