package Ngay19_04.CodeDemo;

public class CodeDemo {
    static int [] array={1,3,4,6,7,8,9,45};
    static int linearSearch(int[] array,int value){
        for (int i : array) {
            if(i==value){
                return i;
            }

        }return -1;
    }

    public static void main(String[] args) {
        System.out.println(linearSearch(array,3));
        System.out.println(linearSearch(array,4));
        System.out.println(linearSearch(array,5));
        System.out.println(linearSearch(array,6));
        System.out.println(linearSearch(array,7));
        System.out.println(linearSearch(array,8));
        System.out.println(linearSearch(array,9));
    }

}
