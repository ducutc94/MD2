package Ngay25_04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) throws IOException {
        List<Account> accountList=new ArrayList<>();
        AccountManage accountManage = new AccountManage(accountList);
        Scanner scanner = new Scanner(System.in);
        int choice=-1;
        do {
            System.out.println("------------");
            System.out.println("----MENU----");
            System.out.println("1.Đăng nhập");
            System.out.println("2.Đăng kí");
            System.out.println("0.Thoát");
            System.out.println("Mời bạn nhập lựa chọn");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Lỗi: "+e.getMessage());
            }
            switch (choice) {
                case 1:
                    accountManage.login();
                    break;
                case 2:
                    List<Account> accounts=accountManage.registerAccount();
                    accountManage.register(accounts);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}

