package Ngay64.BaiTapCuaNgu;

import java.util.Scanner;

public class Cach2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sô lượng học sinh:");
        int size = scanner.nextInt();
        scanner.nextLine();
        Students[] students = new Students[size];
        for (int i = 0; i < students.length; i++) {
            students[i] = inPut(i);
        }
        double max = getAVG(students[0]);
        int index = 0;
        for (int i = 1; i < students.length; i++) {
            if ((getAVG(students[i]) > max)) {
                index = i;
            }
        }
        System.out.println(students[index]);
    }

    public static Students inPut(int i) {
        System.out.println("Nhập tên học sinh thứ :" + (i + 1));
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi học sinh thứ : " + (i + 1));
        int age = scanner.nextInt();
        System.out.println("Nhập điểm toán học sinh thứ : " + (i + 1));
        int diemToan = scanner.nextInt();
        System.out.println("Nhập điểm lí học sinh thứ : " + (i + 1));
        int diemli = scanner.nextInt();
        System.out.println("Nhập điểm hóa học sinh thứ : " + (i + 1));
        int diemhoa = scanner.nextInt();
        scanner.nextLine();
        return new Students(name, age, diemToan, diemli, diemhoa);

    }

    public static double getAVG(Students students) {
        return (students.getDiemToan() + students.getDiemLi() + students.getDiemHoa()) / 3;
    }
}
