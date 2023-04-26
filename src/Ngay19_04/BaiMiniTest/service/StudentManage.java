package Ngay19_04.BaiMiniTest.service;

import Ngay19_04.BaiMiniTest.IOFile1.IOFile;
import Ngay19_04.BaiMiniTest.Model.Classroom;
import Ngay19_04.BaiMiniTest.Model.Manage;
import Ngay19_04.BaiMiniTest.Model.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManage implements Manage<Student> {

    static Scanner scanner = new Scanner(System.in);
    static List<Student> studentList = new ArrayList<>();
    static IOFile ioFile = new IOFile();

    static {
        try {
            studentList = ioFile.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String[] gender = new String[]{"Nam", "Nữ", "Other"};
    ClassroomManage classroomManage =new ClassroomManage();


    public StudentManage(ClassroomManage classroomManage) {

    }

    @Override
    public void creat() throws IOException {
        System.out.println("Nhập tên học sinh:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi học sinh:");
        int age=-1;
        do {
            try {
                age = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi:" + e.getMessage());
                System.out.println("Mời nhập lại:");
            }
        } while (true);
        System.out.println("Chọn giới tính:");
        String string = gender(scanner, gender);
        System.out.println("Nhập điểm TB học sinh:");
        System.out.println("0<= Điểm TB <=10");
        double avg=-1;
        do {
            try {
                avg = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi:" + e.getMessage());
                System.out.println("Mời nhập lại:");
            }
        } while (true);
        System.out.println("Nhập tên lớp");
        Classroom classroom =new Classroom();
        classroom = classroomManage.setClassrooms();
        studentList.add(new Student(name, age, string, avg, classroom));
        ioFile.writeFile(studentList);
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


    @Override
    public void edit() throws IOException {
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
        Classroom classroom;
        classroom=classroomManage.setClassrooms();
        studentList.get(editById).setClassroom(classroom);
        ioFile.writeFile(studentList);
    }

    @Override
    public Student delete() throws IOException {
        System.out.println("Nhập id cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int deleteID = getStudentByID(id);
        if (deleteID == -1) {
            return null;
        } else {
            Student student = studentList.remove(deleteID);
            ioFile.writeFile(studentList);
            return student;
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

    public void displayByClassroom() throws IOException {
        classroomManage.displayClass();
        System.out.println("Mời nhập lớp muốn hiển thị: ");
        int choice = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < ClassroomManage.classrooms.size(); i++) {
            if (choice == ClassroomManage.classrooms.get(i).getId()) {
                for (Student student : studentList) {
                    if (student.getClassroom().equals(ClassroomManage.classrooms.get(i))) {
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

    public void deleteClassAndStudent(Classroom classroom) throws IOException {
        boolean flag = true;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getClassroom().getName().equals( classroom.getName())) {
                studentList.remove(i);
                flag = false;
            }
        }
        if (!flag) {
            classroomManage.deleteById();
            System.out.println("Xóa thành công");
            displayAll();
        } else {
            System.out.println("Không có id lớp class cần xóa");
        }


    }
}
