package Ngay19_04.BaiMiniTest.service;

import Ngay19_04.BaiMiniTest.Model.Classroom;
import Ngay19_04.BaiMiniTest.Model.Manage;
import Ngay19_04.BaiMiniTest.Model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManage implements Manage<Student> {
    static Scanner scanner = new Scanner(System.in);
    List<Student> studentList = new ArrayList<>();
    static String[] gender = new String[]{"Nam", "Nữ", "Other"};
    ClassroomManage classroomManage = new ClassroomManage();

    public StudentManage() {
        studentList.add(new Student("Nam", 18, "Nam", 8.5, classroomManage.classrooms.get(0)));
        studentList.add(new Student("Bắc", 19, "Nam", 7.8, classroomManage.classrooms.get(1)));
        studentList.add(new Student("Trung", 20, "Nữ", 4.3, classroomManage.classrooms.get(0)));
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
        scanner.nextLine();
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
    public void edit() {
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
        studentList.get(editById).setGender(gender(scanner, gender));
        System.out.println("Nhập điểm TB mới: ");
        double avgPoint = Double.parseDouble(scanner.nextLine());
        if (0 <= avgPoint && avgPoint <= 100) {
            studentList.get(editById).setAvgPoint(avgPoint);
        }
        System.out.println("Nhập lớp mới: ");
        classroomManage.displayClass();
        studentList.get(editById).setClassroom(setClassroomManage());
    }

    @Override
    public Student delete() {
        System.out.println("Nhập id cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int deleteID = getStudentByID(id);
        if (deleteID == -1) {
            return null;
        } else {
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
        if (deleteID == -1) {
            return null;
        } else {
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

    public void displayByClassroom() {
        classroomManage.displayClass();
        System.out.println("Mời nhập lớp muốn hiển thị: ");
        int choice = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < classroomManage.classrooms.size(); i++) {
            if (choice == classroomManage.classrooms.get(i).getId()) {
                for (Student student : studentList) {
                    if (student.getClassroom().equals(classroomManage.classrooms.get(i))) {
                        System.out.println(student);
                    }
                }
            }
        }
    }

    public void displayLear() {
        for (Student student : studentList) {
            if (student.getAvgPoint() > 8 && (student.getAvgPoint() < 10)) {
                System.out.println(student + " Xếp loại giỏi");
            } else if (student.getAvgPoint() > 6) {
                System.out.println(student + " Xếp loại khá");
            } else if (student.getAvgPoint() > 4.5) {
                System.out.println(student + " Xếp loại TB");
            } else {
                System.out.println(student + " Xếp loại kém");
            }
        }

    }

    public void displayMaxPoint() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getAvgPoint() > max) {
                max = studentList.get(i).getAvgPoint();
                index = i;
            }

        }
        System.out.println(studentList.get(index));
    }

    public void displayMinPoint() {
        double min = studentList.get(0).getAvgPoint();
        int index = 0;
        for (int i = 1; i < studentList.size(); i++) {
            if (studentList.get(i).getAvgPoint() < min) {
                min = studentList.get(i).getAvgPoint();
                index = i;
            }

        }
        System.out.println(studentList.get(index));
    }

    public void searchByNameContain() {
        System.out.println("Nhâp tên học sinh cần tìm kiếm: ");
        String name = scanner.nextLine();
        boolean flag = true;
        if (!name.equals("")) {
            for (Student student : studentList) {
                if (student.getName().contains(name)) {
                    displayStudent(student);
                    flag = false;
                }

            }
            if (flag) {
                System.out.println("Không tìm thấy học sinh như trên .");
            }

        } else {
            System.out.println("Bạn không được để trống");
            System.out.println("Mời bạn quay trở lại MENU");
        }

    }

    public void displayByGender(Scanner scanner) {
        displayAll();
        System.out.println("Mời bạn nhập giới tính muốn hiển thị ");
        String string = scanner.nextLine();
        boolean flag = true;
        if (!string.equals("")) {
            for (Student student : studentList) {
                if (student.getGender().equals(string)) {
                    displayStudent(student);
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Không có học sinh nào");
            }
        } else {
            System.out.println("Bạn không được để trống");
            System.out.println("Mời bạn quay trở lại MENU");
        }
    }

    public void deleteClassAndStudent() {
        displayAll();
        System.out.println("Nhập id lớp class cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getClassroom().getId() == id) {
                studentList.remove(i);
                flag = false;
            }
        }
        if (!flag) {
            classroomManage.deleteById(id);
            System.out.println("Xóa thành công");
            displayAll();
        } else {
            System.out.println("Không có id lớp class cần xóa");
        }


    }

    public void deleteByIdClass() {
        classroomManage.displayClass();
        System.out.println("Nhập id class muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < classroomManage.classrooms.size(); i++) {
            if (id == classroomManage.classrooms.get(i).getId()) {
                Classroom remove = classroomManage.classrooms.remove(i);
                System.out.println(remove);
            }
        }


    }

    public void editClass() {
        System.out.println("Nhập id class muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < classroomManage.classrooms.size(); i++) {
            if (id == classroomManage.classrooms.get(i).getId()) {
                System.out.println("Nhâp tên lớp mới");
                String name = scanner.nextLine();
                classroomManage.classrooms.get(i).setName(name);
                System.out.println("Sửa thành công");
                System.out.println(classroomManage.classrooms.get(i));
            }
        }
    }
    public  void creatClass(){
        System.out.println("Nhập tên lớp");
        String name=scanner.nextLine();
        Classroom classroom=new Classroom(name);
        classroomManage.classrooms.add(classroom);
        classroomManage.displayClass();
    }
}
