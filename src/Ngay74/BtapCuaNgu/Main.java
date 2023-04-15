package Ngay74.BtapCuaNgu;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FullTime nv1 = new FullTime( "NV1", 18, 10);
        FullTime nv2 = new FullTime( "NV2", 18, 3);
        FullTime nv3 = new FullTime( "NV3", 18, 5);
        PartTime pv1 = new PartTime( "PV1", 15, 2);
        PartTime pv2 = new PartTime( "PV2", 15, 2);
        Employee[] employees = {nv1, nv2, nv3, pv1, pv2};

        do {
            System.out.println("s2-----------MENU----------2s");
            System.out.println("1.Hiển Thị danh sách nhân viên.");
            System.out.println("2.Thêm nhân viên mới.");
            System.out.println("3.Xóa.");
            System.out.println("4.Sửa.");
            System.out.println("Nhập lựa chọn của bạn.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    display(employees);
                    break;
                case 2:
                    employees = add(employees);
                    display(employees);
                    break;
                case 3:
                    employees = delete(scanner, employees);
                    display(employees);
                    break;
                case 4:
                    employees = edit(scanner, employees);
                    display(employees);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);

    }

    public static void display(Employee[] employees) {
        int choice;
        do {
            System.out.println("1.Danh sách nhân viên  FullTime:");
            System.out.println("2.Danh sách nhân viên  PartTime:");
            System.out.println("0.Thoát:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách nhân viên  FullTime:");
                    for (int i = 0; i < employees.length; i++) {
                        if (employees[i] instanceof FullTime) {
                            System.out.println((FullTime) employees[i]);
                        }
                    }
                    return;
                case 2:
                    System.out.println("Danh sách nhân viên  PartTime:");
                    for (int i = 0; i < employees.length; i++) {
                        if (employees[i] instanceof PartTime) {
                            System.out.println((PartTime) employees[i]);
                        }
                    }
                    return;
                default:
                    System.out.println("Không có lựa chọn trên.");
            }
        } while (choice != 0);
    }

    public static Employee[] delete(Scanner scanner, Employee[] employees) {
        System.out.println("Nhập tên nhân viên muốn xóa.");
        String name = scanner.nextLine();
        Employee[] deleteProduct = new Employee[employees.length - 1];
        boolean check = true;
        int index = 0;
        for (Employee p : employees) {
            if (!p.getName().equals(name)) {
                deleteProduct[index] = p;
                index++;
                check = false;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
            return employees;
        } else {
            System.out.println("Bạn đã xóa thành công.");
            return deleteProduct;
        }

    }

    public static Employee[] add(Employee[] employees) {
        System.out.println("1.Nếu bạn muốn thêm FullTime");
        System.out.println("2.Nếu bạn muốn thêm PartTime");
        int number = Integer.parseInt(scanner.nextLine());
        Employee[] employees1 = new Employee[employees.length + 1];
        FullTime newFulltime = new FullTime();
        PartTime newParttime = new PartTime();
        int idUp;
        if(employees.length==0){
            idUp=0;
        }else {
            idUp=employees[employees.length-1].getId();
        }
        if (number == 1) {
            newFulltime.setId(idUp + 1);
            System.out.println("Nhập tên cho nhân viên");
            newFulltime.setName(scanner.nextLine());
            System.out.println("Nhập tuổi cho nhân viên");
            newFulltime.setAge(scanner.nextInt());
            System.out.println("Nhập year cho nhân viên");
            newFulltime.setYearOfExp(scanner.nextInt());
            for (int i = 0; i < employees.length; i++) {
                employees1[i] = employees[i];
            }
            employees1[employees.length] = newFulltime;
        }
        if (number == 2) {

            newParttime.setId(idUp + 1);
            System.out.println("Nhập tên cho nhân viên");
            newParttime.setName(scanner.nextLine());
            System.out.println("Nhập tuổi cho nhân viên");
            newParttime.setAge(scanner.nextInt());
            System.out.println("Nhập year cho nhân viên");
            newParttime.setWordTime(scanner.nextInt());
            for (int i = 0; i < employees.length; i++) {
                employees1[i] = employees[i];
            }
            employees1[employees.length] = newParttime;
        }
        scanner.nextLine();
        return employees1;
    }

    public static Employee[] edit(Scanner scanner, Employee[] employees) {
        System.out.println("Nhập ID nhân viên bạn muốn sửa.");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                if (employees[i] instanceof FullTime) {
                    System.out.println("Nhập tên mới:");
                    employees[i].setName(scanner.nextLine());
                    System.out.println("Nhập tuổi mới:");
                    employees[i].setAge(scanner.nextInt());
                    System.out.println("Nhập năm kinh nghiệm:");
                    ((FullTime) employees[i]).setYearOfExp(scanner.nextInt());
                } else {
                    System.out.println("Nhập tên mới:");
                    employees[i].setName(scanner.nextLine());
                    scanner.nextLine();
                    System.out.println("Nhập tuổi mới:");
                    employees[i].setAge(scanner.nextInt());
                    System.out.println("Nhập số giờ kinh nghiệm:");
                    ((PartTime) employees[i]).setWordTime(scanner.nextInt());
                }
            }

        }
        scanner.nextLine();
        System.out.println("Bạn đã sửa thành công");
        return employees;


    }
}


