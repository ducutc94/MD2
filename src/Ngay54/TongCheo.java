package Ngay54;

import java.util.Arrays;
import java.util.Scanner;

public class TongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Nhap phan tu:");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < 3; i++) {
                    sum += arr[i][i];
                    sum1 += arr[i][arr.length-1-i];
            }    System.out.println(sum);
        System.out.println(sum1);

    }
    }
