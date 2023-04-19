package Ngay19_04.BaiMiniTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StudentManage implements Manage<Student> {
    static Scanner scanner = new Scanner(System.in);
    List<Student> studentList = new ArrayList<>();
    static String[] gender = new String[]{"Nam", "Nữ", "Other"};
    ClassroomManage classroomManage = new ClassroomManage();

    public StudentManage() {
        studentList.add(new Student("Nam", 18, "Nam", 8.5, classroomManage.classrooms.get(0)));
        studentList.add(new Student("Bắc", 19, "Nam", 7.8, classroomManage.classrooms.get(1)));
        studentList.add(new Student("Trung", 20, "Nam", 4.3, classroomManage.classrooms.get(0)));
    }

    @Override
    public void creat() {
        System.out.println("Nhập tên học sinh:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi học sinh:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Chọn giới tính:");
        String string = gender(scanner, gender);
        System.out.println("Nhập điểm TB học sinh:");
        System.out.println("0<= Điểm TB <=10");
        Double avgPoint = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập tên lớp");
        Classroom classroom = setClassroomManage();
        studentList.add(new Student(name, age, string, avgPoint, classroom));
    }

    public String gender(Scanner scanner, String[] gender) {
        System.out.println("1.Nam.");
        System.out.println("2.Nữ.");
        System.out.println("3.Other.");
        int choice = Integer.parseInt(scanner.nextLine());
        String str = null;
        if (choice == 1) {
            str = gender[0];
        } else if (choice == 2) {
            str = gender[1];
        } else if (choice == 3) {
            str = gender[2];
        }
        return str;
    }

    public Classroom setClassroomManage() {
        classroomManage.displayClass();
        int choice = scanner.nextInt();
        for (Classroom c : classroomManage.classrooms) {
            if (choice == c.getId()) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Student> edit() {
        System.out.println("Nhập id cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int editById = getStudentByID(id);
        System.out.println("Nhập tên mới: ");
        String name = scanner.nextLine();
        if (!name.equals("")) {
            studentList.get(editById).setName(name);
        }
        System.out.println("Nhập tuổi mới: ");
        int age = Integer.parseInt(scanner.nextLine());
        if (0 <= age && age <= 120) {
            studentList.get(editById).setAge(age);
        }
        System.out.println("Nhập giới tính mới: ");
        System.out.println("1.Nam.");
        System.out.println("2.Nữ.");
        System.out.println("3.Other.");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                studentList.get(editById).setGender("Nam");
            case 2:
                studentList.get(editById).setGender("Nữ");
            case 3:
                studentList.get(editById).setGender("Other");
        }
        System.out.println("Nhập điểm TB mới: ");
        Double avgPoint = Double.parseDouble(scanner.nextLine());
        if (0 <= avgPoint && avgPoint <= 100) {
            studentList.get(editById).setAvgPoint(avgPoint);
        }
        System.out.println("Nhập lớp mới: ");
        classroomManage.displayClass();
        int choiceClass = scanner.nextInt();
        if (choiceClass == classroomManage.classrooms.get(editById).getId()) {
            studentList.get(editById).setClassroom(classroomManage.classrooms.get(editById));
        }
        return studentList;
    }

    @Override
    public Student delete() {
        System.out.println("Nhập id cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int deleteID = getStudentByID(id);
       if(deleteID==-1){
           return null;
       }else {
           return studentList.remove(deleteID);
       }

    }
    public void displayStudent(Student student) {
        if (student != null) {
            System.out.println(student);

        } else {
            System.out.println("Không có học sinh có id như trên");
        }
    }
    @Override
    public Student search() {
        System.out.println("Nhập id cần tìm: ");
        int id = Integer.parseInt(scanner.nextLine());
        int deleteID = getStudentByID(id);
        if(deleteID==-1){
            return null;
        }else {
            return studentList.get(deleteID);
        }
    }

    @Override
    public void displayAll() {
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public int getStudentByID(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }
    public void displayByClassroom(){
        classroomManage.displayClass();
        System.out.println("Mời nhập lớp muốn hiển thị: ");
        int choice=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < classroomManage.classrooms.size(); i++) {
                if(choice==classroomManage.classrooms.get(i).getId()){
                    for (int j=0;j<studentList.size();j++){
                        if(studentList.get(j).getClassroom().equals(classroomManage.classrooms.get(i))){
                            System.out.println(studentList.get(j));
                        }
                    }
            }
        }
    }
    public  void displayLear(){
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getAvgPoint()>8&&(studentList.get(i).getAvgPoint()<10)){
                System.out.println(studentList.get(i)+ " Xếp loại giỏi");
            }else if(studentList.get(i).getAvgPoint()>6){
                System.out.println(studentList.get(i)+ " Xếp loại khá");
            }else if(studentList.get(i).getAvgPoint()>4.5){
                System.out.println(studentList.get(i)+ " Xếp loại TB");
            }else {
                System.out.println(studentList.get(i)+ " Xếp loại kém");
            }
        }

    }
    public void displayMaxPoint(){
        double max=0;
        int index=0;
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getAvgPoint()>max){
                max=studentList.get(i).getAvgPoint();
                index=i;
            }

        }
        System.out.println(studentList.get(index));
    }
}
