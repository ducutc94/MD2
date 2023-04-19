package Ngay19_04.BaiMiniTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassroomManage {
    static Scanner scanner=new Scanner(System.in);
    List<Classroom> classrooms=new ArrayList<>();

    public ClassroomManage() {
       classrooms.add(new Classroom("lớp 1"));
       classrooms.add(new Classroom("lớp 2"));
    }

    public void creatClass(){
        System.out.println("Nhập tên lớp");
        String name=scanner.nextLine();
        classrooms.add(new Classroom(name));
    }
    public void displayClass(){
        for (int i = 0; i < classrooms.size(); i++) {
            System.out.println(classrooms.get(i));
        }
    }
}
