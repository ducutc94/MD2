package Ngay54;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] array=new int[3][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhap cac phan tu cua mang");
                array[i][j]=scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Nhap so tong muon tinh:");
        int size;
        size=scanner.nextInt();
        int sum3=0;
        int i = 0;
        while (i < array.length) {
            for (int j = 0; j < array[i].length; j++) {
                if (size == j) {
                    sum3 += array[i][j];
                }
            }
            i++;
        }
        System.out.println(sum3);
    }
}
