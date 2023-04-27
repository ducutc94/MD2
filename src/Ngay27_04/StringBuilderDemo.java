package Ngay27_04;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder= new StringBuilder("welcome to code gym");
        stringBuilder.append(' ');
        stringBuilder.append("CO223I1");
        System.out.println(stringBuilder);
        //.substring trả về chuỗi từ vị trí 5=>10.
        String str=stringBuilder.substring(5,10);
        System.out.println(str);

        stringBuilder.insert(6," lady");
        System.out.println(stringBuilder);
        String str1= String.valueOf(stringBuilder.delete(12,15));
        System.out.println(str1);



    }


}
