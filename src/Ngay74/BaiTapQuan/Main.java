package Ngay74.BaiTapQuan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số lượng sản phẩm: ");
        int size = scanner.nextInt();
        Product[] product = new Product[size];
        //Duyệt mảng:
        for (int i = 0; i < product.length; i++) {
            product[i] = inProduct(i);
        }
        System.out.println("Nhap điều bạn muốn:");
        int number=scanner.nextInt();
        switch (number){
            case 1:
                Edit(product);
                break;
            case 2:
                Delete(product);
                break;
            case 3:
                Total(product);
                break;
            case 4:
                Search(product);
                break;
            default:
                System.out.println("ời nhập lại:");
        }




    }

    public static String searchToName() {
        System.out.println("Nhập tên sản phâ cần tìm kiếm: ");
        String name = scanner.nextLine();
        return name;
    }

    public static Product inProduct(int i) {
        System.out.println("Nhập ID cho sản phẩm: " + (i + 1));
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên cho sản phẩm: " + (i + 1));
        String name = scanner.nextLine();
        System.out.println("Nhập giá cho sản phẩm: " + (i + 1));
        double price = scanner.nextDouble();
        System.out.println("Nhập loại cho sản phẩm: " + (i + 1));
        String type = scanner.nextLine();
        scanner.nextLine();
        return new Product(id, name, price, type);
    }

    public static void Edit(Product[] product) {
        System.out.println("Nhập ID cần sửa: ");
        int indexSua = scanner.nextInt();
        for (int i = 0; i < product.length; i++) {
            if (indexSua == product[i].getId()) {
                product[i] = inProduct(i);
            }

        }
        System.out.println(Arrays.toString(product));
    }

    public static void Delete(Product[] product) {
        System.out.println("Nhập ID cần tìm kiếm: ");
        int indexDele = scanner.nextInt();
        Product[] newproducts = new Product[product.length - 1];
        int j = 0;
        for (int i = 0; i < product.length; i++) {
            if (indexDele != product[i].getId()) {
                newproducts[j] = product[i];
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(newproducts[i] + " ");
        }

    }

    public static void Total(Product[] product) {
        int total = 0;
        for (int i = 0; i < product.length; i++) {
            total += product[i].getPrice();
        }
        System.out.println("Tổng giá các sản phẩm là : " + total);
    }

    public static void Search(Product[] product) {
        int index;
        boolean flag = true;
        String findName = searchToName();
        for (int i = 0; i < product.length; i++) {
            if (product[i].getName().equals(findName)) {
                index = i;
                flag = false;
                System.out.println(product[index]);
                break;
            }
        }
        if (flag) {
            System.out.println("Khong co san pham nao:");
        }
        System.out.println(Arrays.deepToString(product));

    }


}
