package Ngay19_04.BaiMiniTest;

import java.util.Scanner;

public class MainTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentManage studentManage = new StudentManage();
        ClassroomManage classroomManage=new ClassroomManage();
        classroomManage.displayClass();
        int choice;
        do {
            System.out.println("-----------------------");
            System.out.println("----------MENU---------");
            System.out.println("1.Tạo mới học sinh.");
            System.out.println("2.Sửa thông tin học sinh theo id.");
            System.out.println("3.Xóa 1 học sinh theo id.");
            System.out.println("4.Hiện thị 1 học sinh theo id.");
            System.out.println("5.Hiển thị tất cả học sinh.");
            System.out.println("6.Hiển Thị học sinh theo lớp.");
            System.out.println("7.Hiển thị học sinh theo điểm TB.");
            System.out.println("8.Hiển thị học sinh có điểm cao và thấp.");
            System.out.println("9.Tìm kiếm theo tên gần đúng.");
            System.out.println("10.Hiển thị theo giới tính.");
            System.out.println("0.Thoát.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManage.creat();
                    break;
                case 2:
                    studentManage.edit();
                    studentManage.displayAll();
                    break;
                case 3:
                    Student student = studentManage.delete();
                    studentManage.displayStudent(student);
                    break;
                case 4:
                    Student student1 = studentManage.search();
                    studentManage.displayStudent(student1);
                    break;
                case 5:
                    studentManage.displayAll();
                    break;
                case 6:studentManage.displayByClassroom();
                    break;
                case 7:studentManage.displayLear();
                    break;
                case 8:studentManage.displayMaxPoint();
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 0:
                    System.exit(0);
            }

        } while (true);
    }
}