package Ngay54;

import java.util.Arrays;
import java.util.Scanner;

public class Xoa1PhanTu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap do dai cua mang:");
        int size = scanner.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu mang thu: "+ (i+1));
            arr[i]=scanner.nextInt();
        }
        int[] newArr=new int[size];
        int x=4;
        int j=0;
        for (int i = 0; i < size; i++) {
            if(x!=arr[i]){
                newArr[j]=arr[i];
                j++;
            }
        }
        for (int c = 0; c < j; c++) {
            System.out.println(newArr[c]+" ");
            System.out.println(Arrays.toString(newArr));
        }
    }
}
