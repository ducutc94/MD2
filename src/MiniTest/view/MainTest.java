package MiniTest.view;

import MiniTest.Controller.ManageStudent;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ManageStudent managePeople=new ManageStudent();
        int choice;
      do{
          System.out.println("-----MENU-----");
          System.out.println("1.Hiển Thị All");
          System.out.println("2.Thêm People");
          System.out.println("3.Thêm Student");
          System.out.println("4.Xóa theo ID");
          System.out.println("5.Tìm kiếm");
          System.out.println("6.Tổng");
          System.out.println("7.Sắp xếp theo điểm TB");
          System.out.println("8.Sửa theo Id");
          System.out.println("0.Thoát");
          System.out.println("--------");
          choice=Integer.parseInt(scanner.nextLine());
          switch (choice){
              case 1:
                  managePeople.display();
                  break;
              case 2:
                  managePeople.addPeople();
                  break;
              case 3:
                  managePeople.addStudent();
                  break;
              case 4:
                  managePeople.deletePeople();
                  break;
              case 5:
                  managePeople.searchPeople();
                  break;
              case 6:
                  managePeople.total();
                  break;
              case 7:
                  managePeople.compareToAveragePoint();
                  break;
              case 8:
                  managePeople.editById();
                  break;
              case 0:
                  System.exit(0);
          }
      }while (true);
    }
}
