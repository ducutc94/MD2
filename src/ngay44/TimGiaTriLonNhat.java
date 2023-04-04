package ngay44;

import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Nhap so ti phu:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("So ti phu qua nhieu:");
            }
        }
            while (size>20);
            arr=new int[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Nhap ti phu thu "+(i+1));
                arr[i]=scanner.nextInt();
            }
            int maxArr=arr[0];
            int index =0;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]>maxArr){
                    maxArr=arr[i];
                    index=i+1;
                }
            }
            System.out.println("Ti phu thu "+ index+" giau nhat voi gia tri tai san la "+ maxArr+" $");
        }
    }
