package ngay44;

import java.util.Scanner;

public class DaoPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int size;
        do {
            System.out.println("Nhap do dai mang:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Do dai qua:");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Moi nhap Phan tu thu " + (i + 1) + " cua mang");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\n");
        }
        System.out.printf("%-20s%s", "Elements in array: ", ""+"\n");
        for (int j = 0; j < arr.length / 2; j++) {
            int tem = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = tem;
        }
        System.out.printf("%-20s%s", "Reverse array: ", ""+"\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\n");
        }
    }
}
