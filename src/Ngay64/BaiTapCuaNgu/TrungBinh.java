//package Ngay64.BaiTapCuaNgu;
//
//import java.util.Scanner;
//
//public class TrungBinh {
//    static  Scanner scanner=new Scanner(System.in);
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Nhập sô lượng học sinh:");
//        int size=scanner.nextInt();
//        scanner.nextLine();
//        Students[] students=new Students[size];
//        for (int i = 0; i < size; i++) {
//            students[i]=new Students();
//            System.out.println("Nhập tên học sinh thứ :" +(i+1));
//            String name=scanner.nextLine();
//            students[i].setTen(name);
//            System.out.println("Nhập tuổi học sinh thứ : "+(i+1));
//            int age=scanner.nextInt();
//            students[i].setTuoi(age);
//            System.out.println("Nhập điểm toán học sinh thứ : "+(i+1));
//            int diemToan=scanner.nextInt();
//            students[i].setDiemToan(diemToan);
//            System.out.println("Nhập điểm lí học sinh thứ : "+(i+1));
//            int diemli=scanner.nextInt();
//            students[i].setDiemLi(diemli);
//            System.out.println("Nhập điểm hóa học sinh thứ : "+(i+1));
//            int diemhoa=scanner.nextInt();
//            students[i].setDiemHoa(diemhoa);
//            scanner.nextLine();
//        }
//        double max=(students[0].diemHoa+students[0].diemLi+students[0].diemToan)/3;
//        int index=0;
//        for (int i = 1; i < students.length; i++) {
//            if((students[i].diemHoa+students[i].diemLi+students[i].diemToan)/3>max){
//                index=i;
//            }
//        }
//        System.out.println(students[index]);
//    }
//    public static Students inPut(){
//        System.out.println("Nhập tên học sinh thứ :" );
//        String name=scanner.nextLine();
//        System.out.println("Nhập tuổi học sinh thứ : ");
//        int age=scanner.nextInt();
//        System.out.println("Nhập điểm toán học sinh thứ : ");
//        int diemToan=scanner.nextInt();
//        System.out.println("Nhập điểm lí học sinh thứ : ");
//        int diemli=scanner.nextInt();
//        System.out.println("Nhập điểm hóa học sinh thứ : ");
//        int diemhoa=scanner.nextInt();
//       return new Students(name,age,diemToan,diemli,diemhoa);
//
//    }
//}
