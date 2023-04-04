package ngay44;

public class MinPhuongThuc {
    public static void main(String[] args) {
        int[] arr={1765,445,53,54,78,42,53,342};
        int i = minArr(arr);
        System.out.println("Gia tri be nhat trong mang la: " +arr[i]);
    }
    public static int minArr(int[] arr){
        int index=0;
        int minArr=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<minArr){
                minArr=arr[i];
                index=i;
            }
        }return index;
    }
}
