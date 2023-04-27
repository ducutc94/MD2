package Ngay19_04.BaiMiniTest.service;

import Ngay19_04.BaiMiniTest.IOFile1.IOFile;
import Ngay19_04.BaiMiniTest.IOFile1.IOFileClassroom;
import Ngay19_04.BaiMiniTest.Model.Classroom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassroomManage {
    static Scanner scanner =new Scanner(System.in);
   static List<Classroom> classrooms=new ArrayList<>();
    static IOFileClassroom ioFileClassroom=new IOFileClassroom();
    static {
        try{
            classrooms=ioFileClassroom.readFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public ClassroomManage() {

    }


    public void displayClass()  {
        for (Classroom classroom : classrooms) {
            System.out.println(classroom);
        }
    }
    public Classroom  deleteById() throws IOException {
        System.out.println("Nhập id cần xóa:");
        int id=-1;
        try {
            id=Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Lỗi: "+e.getMessage());
        }
        int deleteId=getClassById(id);
        if(deleteId!=-1){
            classrooms.remove(deleteId);
            ioFileClassroom.writeFile(classrooms);
            return classrooms.get(deleteId);
        }return null;
    }
    public int getClassById(int id){
        for (int i = 0; i < classrooms.size(); i++) {
            if(classrooms.get(i).getId()==id){
                return i;
            }

        }
        return -1;
    }
    public void creat() throws IOException {
        System.out.println("Nhập tên lớp");
        String name = scanner.nextLine();
        classrooms.add(new Classroom(name));
        ioFileClassroom.writeFile(classrooms);

    }
    public void edit() throws IOException {
        System.out.println("Nhập id class muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (Classroom classroom : classrooms) {
            if (id == classroom.getId()) {
                System.out.println("Nhâp tên lớp mới");
                String name = scanner.nextLine();
                classroom.setName(name);
                System.out.println("Sửa thành công");
                System.out.println(classroom);
            }
        }
        ioFileClassroom.writeFile(classrooms);
    }
    public Classroom setClassrooms() throws IOException {
        System.out.println("Nhâp lớp cần set:");
        int choice = scanner.nextInt();
        for (Classroom c : classrooms) {
            if (choice == c.getId()) {
                return c;
            }
        }
        return null;
    }

}
