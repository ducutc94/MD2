package Ngay104;

import java.util.Scanner;

public class MainTest {
    private static Product[] products;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //tạo menu chương trình
        do {
            System.out.println("MENU");
            System.out.println("1. Tạo mảng sản phẩm");
            System.out.println("2. Tạo sản phẩm");
            System.out.println("3. Tính tổng tiền sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm theo tên");
            System.out.println("5. Tìm kiếm sản phẩm theo tên gần đúng");
            System.out.println("6. Hiển thị sản phẩm");
            System.out.println("7. Xóa sản phẩm theo mã");
            System.out.println("8. Sửa sản phẩm theo mã");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    products = getArrayProduct(scanner);
                    break;
                case 2:
                    createProducts(scanner, products);
                    break;
                case 3:
                    System.out.println("Tổng giá tiền của các sản phẩm là: " + sumPriceOfProducts(products) + "USD");
                    break;
                case 4:
                    Product productSearch = searchByName(scanner, products);
                    if (productSearch == null) {
                        System.out.println("Không tìm thấy sản phẩm có tên tương ứng!");
                    } else {
                        System.out.println(productSearch);
                    }
                    break;
                case 5:
                    Product[] productSearchAll = searchByNameContaining(scanner, products);
                    displayAllProduct(productSearchAll);
                    break;
                case 6:
                    displayAllProduct(products);
                    break;
                case 7:
                    displayAllProduct(products);
                    products = deleteProduct(scanner, products);
                    break;
                case 8:
                    displayAllProduct(products);
                    updateProduct(scanner, products);
                    System.out.println("Sửa thành công!");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    public static Product[] getArrayProduct(Scanner scanner) {
        System.out.println("Nhập vào số lượng sản phẩm muốn tạo: ");
        //lớp Wrapper
        int length = Integer.parseInt(scanner.nextLine());
        return new Product[length];
    }

    public static Product getProduct(Scanner scanner, int i) {
        System.out.println("Nhập vào mã của sản phẩm thứ " + (i+1) + ":");
        String code = scanner.nextLine();
        System.out.println("Nhập vào tên của sản phẩm thứ " + (i+1) + ":");
        String name = scanner.nextLine();
        System.out.println("Nhập vào giá của sản phẩm thứ " + (i+1) + ":");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào loại của sản phẩm thứ " + (i+1) + ":");
        String type = scanner.nextLine();
        return new Product(code, name, price, type);
    }

    public static void createProducts(Scanner scanner, Product[] products) {
        for (int i = 0; i < products.length; i++) {
            products[i] = getProduct(scanner, i);
        }
    }

    public static double sumPriceOfProducts(Product[] products) {
        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice();
        }
        return sum;
    }

    public static Product searchByName(Scanner scanner, Product[] products) {
        System.out.println("Nhập vào tên sản phẩm bạn muốn tìm: ");
        String nameSearch = scanner.nextLine();
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(nameSearch)) {
                return p;
            }
        }
        return null;
    }

    public static Product[] searchByNameContaining(Scanner scanner, Product[] products) {
        System.out.println("Nhập vào tên sản phẩm bạn muốn tìm: ");
        String nameSearch = scanner.nextLine();
        Product[] productSearch = new Product[products.length];
        int index = 0;
        for (Product p : products) {
            if (p.getName().contains(nameSearch)) {
                productSearch[index] = p;
                index++;
            }
        }
        return productSearch;
    }

    public static Product[] deleteProduct(Scanner scanner, Product[] products) {
        System.out.println("Nhập mã mà bạn muốn xóa: ");
        String code = scanner.nextLine();
        Product[] productDelete = new Product[products.length - 1];
        int index = 0;
        boolean check = false;
        for (Product p : products) {
            if (!p.getCode().equals(code)) {
                productDelete[index] = p;
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("Xóa thành công!");
            return productDelete;
        } else {
            return products;
        }
    }

    public static void updateProduct(Scanner scanner, Product[] products) {
        System.out.println("Nhập mã mà bạn muốn sửa: ");
        String code = scanner.nextLine();
        for (Product p : products) {
            if (p.getCode().equals(code)) {
                System.out.println("Nhập tên mới của sản phẩm: ");
                p.setName(scanner.nextLine());
                System.out.println("Nhập giá mới của sản phẩm: ");
                p.setPrice(Double.parseDouble(scanner.nextLine()));
                System.out.println("Nhập loại mới của sản phẩm: ");
                p.setType(scanner.nextLine());
            }
        }
    }

    public static void displayAllProduct(Product[] products) {
        for (Product p : products) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }
}
