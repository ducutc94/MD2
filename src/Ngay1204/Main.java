package Ngay1204;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Brand newBrand = new Brand( "Apple");
        Brand newBrand1 = new Brand( "SamSung");
        Brand newBrand2 = new Brand( "Sony");
        Brand[] brands = {newBrand, newBrand1, newBrand2};
        Product[] products;
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------MENU----------");
            System.out.println("1.Tạo Danh sách và hiển thị");
            System.out.println("0.Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    products = creatProduct(scanner);
                    creatMemberProduct(products, scanner, brands);
                    display(products);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn của bạn");
            }
        } while (true);
    }
    public static Product[] creatProduct(Scanner scanner) {
        System.out.println("Nhập số đối tượng cần tạo: ");
        int size = Integer.parseInt(scanner.nextLine());
        return new Product[size];
    }

    public static void creatMemberProduct(Product[] products, Scanner scanner, Brand[] brands) {
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            System.out.println("Nhập tên sản phẩm thứ " + (i + 1) + ":");
            products[i].setName(scanner.nextLine());
            System.out.println("Nhập kiểu sản phẩm thứ " + (i + 1) + ":");
            products[i].setType(scanner.nextLine());
            for (Brand value : brands) {
                System.out.println(value);
            }
            System.out.println("Nhập thương hiệu sản phẩm thứ " + (i + 1) + ":");
            int brand = Integer.parseInt(scanner.nextLine());
            for (Brand value : brands) {
                if (value.getId() == brand) {
                    products[i].setBrand(value);
                }
            }
        }
    }
    public static void display(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

}
