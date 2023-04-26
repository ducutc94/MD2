package Ngay19_04.BaiMiniTest.Model;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private Double avgPoint;
    private Classroom classroom;
    private static int INDEX = 0;
    Scanner scanner;
    private String lear;

    public String getLear() {
        return lear;
    }

    public void setLear(String lear) {
        this.lear = lear;
    }

    public Student() {
        scanner = new Scanner(System.in);
        this.id = ++INDEX;
    }

    public Student(String name, int age, String gender, Double avgPoint, Classroom classroom) {
        scanner = new Scanner(System.in);
        this.id = ++INDEX;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.avgPoint = avgPoint;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(Double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return
                 id +
                "," + name +
                "," + age +
                "," + gender  +
                "," + avgPoint +
                "," + classroom.getName()
               ;
    }
}
