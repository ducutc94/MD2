package ngay03;

import java.util.Scanner;

public class TinhCanNang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chieu cao:");
        double height=scanner.nextDouble();
        System.out.println("Nhap  can nag:");
        double weight= scanner.nextDouble();
        double BMI=weight/(height*height);
        System.out.println(BMI);
        if(BMI<18.5){
            System.out.println("Underweight");
        }else if(BMI<25){
            System.out.println("Normal");
        }else if(BMI<30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }

    }
}
