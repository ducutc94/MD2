package Ngay19_04.BaiMiniTest.Controller;

import Ngay19_04.BaiMiniTest.Model.Student;
import Ngay19_04.BaiMiniTest.service.StudentManage;

import java.util.Scanner;

public class MainTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentManage studentManage = new StudentManage();
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
            System.out.println("11.Xóa học sinh theo lớp.");
            System.out.println("12.Xóa lớp.");
            System.out.println("13.Sửa lớp.");
            System.out.println("14.Thêm lớp.");
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
                case 6:
                    studentManage.displayByClassroom();
                    break;
                case 7:
                    studentManage.displayLear();
                    break;
                case 8:
                    int choice1;
                    do {
                        System.out.println("1.Hiển thị học sinh có điểm cao nhất: ");
                        System.out.println("2.Hiển thị học sinh có điểm thấp nhất: ");
                        System.out.println("0.Quay trở lại MENU. ");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                studentManage.displayMaxPoint();
                                break;
                            case 2:
                                studentManage.displayMinPoint();
                                break;
                            case 0:
                                break;
                        }
                    } while (choice1 != 0);

                    break;
                case 9:
                    studentManage.searchByNameContain();
                    break;
                case 10:
                    studentManage.displayByGender(scanner);
                    break;
                case 11:
                    studentManage.deleteClassAndStudent();
                    break;
                case 12:
                    studentManage.deleteByIdClass();
                    break;
                case 13:
                    studentManage.editClass();
                    break;
                case 14:studentManage.creatClass();
                break;
                case 0:
                    System.exit(0);
            }

        } while (true);
    }

}