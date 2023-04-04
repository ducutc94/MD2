package ngay44;

import java.util.Arrays;

public class DuyetMang {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1, 3, 4, 5, 7, 7, 4};
        int[] newArr = new int[7];
        int x = 7;
        int j = 0;
        for (int k : arr) {
            if (k != x) {
                newArr[j] = k;
                j++;
            }
        }
        for (int z = 0; z < j; z++) {
            System.out.print(newArr[z]+" ");
        }
        System.out.print("\n");
        System.out.println(Arrays.toString(newArr));
    }
}
