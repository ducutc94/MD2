package Ngay25_04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManage {
    List<Account> account;
    private final Scanner scanner;
    static File file = new File("E:\\NNLT\\MD2\\MD2\\src\\Ngay25_04\\account.txt");

    public AccountManage(List<Account> accountList) {
       this.account=accountList;
       scanner=new Scanner(System.in);

    }
    public   List<Account> registerAccount() {
        List<Account> accountList = new ArrayList<>();
        System.out.println("Nhập tên đăng nhập:");
        String username = scanner.nextLine();
        System.out.println("Nhập tên mật khẩu:");
        String password = scanner.nextLine();
        System.out.println("Nhập tên số điên thoại:");
        String   phone = scanner.nextLine();
        System.out.println("Nhập tên địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Nhập tên tên đầy đủ:");
        String fullName = scanner.nextLine();
        accountList.add(new Account(username,password,fullName,phone,address));
        return accountList;

    }

    public   void register(List<Account> accounts) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        FileWriter fileWriter=new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Account account : accounts) {
            bufferedWriter.write(account + "\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    public   void readFile(List<Account> accountList) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String c;
        String[] str;
        while ((c = bufferedReader.readLine()) != null) {
            str = c.split(",");
            accountList.add(new Account(str[1], str[2]));
        }
        bufferedReader.close();
    }
    public   void login() throws IOException {
        List<Account> accountList = new ArrayList<>();
        readFile(accountList);
        System.out.println(accountList);
        System.out.println("Nhập tên đăng nhập: ");
        String username = scanner.nextLine();
        System.out.println("Nhập tên passwword: ");
        String password = scanner.nextLine();
        boolean flag = true;
        for (Account a : accountList) {
            System.out.println(a.getUsername());
            if (a.getUsername().equals(username)) {
                flag = false;
                if (a.getPassword().equals(password)) {
                    System.out.println("Chúc mừng bạn đã dăng nhập thành công!!");
                } else {
                    System.out.println("Mật Khẩu không chính xác.");
                }
                break;
            }
        }
        if (flag) System.out.println("Tên đăng nhập không tồn tại.");
    }
}

