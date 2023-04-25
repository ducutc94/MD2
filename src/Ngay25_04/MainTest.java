package Ngay25_04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Ngay25_04.AccountManage.file;

public class MainTest {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        List<Account> accountList=new ArrayList<>();
        AccountManage accountManage = new AccountManage(accountList);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------------");
            System.out.println("----MENU----");
            System.out.println("1.Đăng nhập");
            System.out.println("2.Đăng kí");
            System.out.println("0.Thoát");
            System.out.println("Mời bạn nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
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

//    private static List<Account> registerAccount(Scanner scanner) {
//        List<Account> accountList = new ArrayList<>();
//        System.out.println("Nhập id:");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập tên đăng nhập:");
//        String username = scanner.nextLine();
//        System.out.println("Nhập tên mật khẩu:");
//        String password = scanner.nextLine();
//        System.out.println("Nhập tên số điên thoại:");
//        int phone = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập tên địa chỉ:");
//        String address = scanner.nextLine();
//        System.out.println("Nhập tên tên đầy đủ:");
//        String fullName = scanner.nextLine();
//        accountList.add(new Account(id,username,password,fullName,phone,address));
//        return accountList;
//
//    }
//
//    private static void register(List<Account> accounts) throws IOException {
//        if (!file.exists()) {
//            throw new FileNotFoundException();
//        }
//        FileWriter fileWriter=new FileWriter(file,true);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        for (Account account : accounts) {
//            bufferedWriter.write(account + "\n");
//        }
//
//        bufferedWriter.close();
//    }
//
//    private static void readFile(List<Account> accountList) throws IOException {
//        if (!file.exists()) {
//            throw new FileNotFoundException();
//        }
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//        String c;
//        String[] str;
//        while ((c = bufferedReader.readLine()) != null) {
//            str = c.split(",");
//            accountList.add(new Account(str[1], str[2]));
//        }
//        bufferedReader.close();
//    }
//    private static void login() throws IOException {
//        List<Account> accountList = new ArrayList<>();
//        readFile(accountList);
//        System.out.println(accountList);
//        System.out.println("Nhập tên đăng nhập: ");
//        String username = scanner.nextLine();
//        System.out.println("Nhập tên passwword: ");
//        String password = scanner.nextLine();
//        boolean flag = true;
//        for (Account a : accountList) {
//            System.out.println(a.getUsername());
//            if (a.getUsername().equals(username)) {
//                flag = false;
//                if (a.getPassword().equals(password)) {
//                    System.out.println("Chúc mừng bạn đã dăng nhập thành công!!");
//                } else {
//                    System.out.println("Mật Khẩu không chính xác.");
//                }
//                break;
//            }
//        }
//        if (flag) System.out.println("Tên đăng nhập không tồn tại.");
//    }
}

