package Ngay27_04;

public class Demo {
    public static void main(String[] args) {
        //Tạo đối tượng String:
        String str="Hello 2 word ";
        String str1= new String("Code Gym");
        String str2="\t Hello Baby \n";
//        System.out.println(str);
//        System.out.println(str1);
//        System.out.println(str.length());// Trả về độ dài
//        System.out.println(str2);
//        System.out.println(str2.trim());
//        String lowerCase = str.toLowerCase();
//        String upperCase = str1.toUpperCase();
//        System.out.println(lowerCase);
//        System.out.println(upperCase);
//        boolean a=str.isEmpty();
//        System.out.println(a);
        String s4=str.concat(str1);
        System.out.println(s4);
        System.out.println( str.indexOf(1));
        System.out.println(str.indexOf("ell"));
        System.out.println(str.indexOf("o",5));
        System.out.println( str.indexOf("2"));
        System.out.println( str.indexOf(2));
//        String s1=new String("hello");
//        String s2="hello";
//        String s3=s1.intern();//Tra ve chuoi tu Pool, bay gio no se giong nhu s2
//        System.out.println(s1==s2);//false boi vi tham chieu la khac nhau
//        System.out.println(s2==s3);//true boi vi tham chieu la giong nhau
//        int value = 30;
//        String s4 = String.valueOf(value);
//        System.out.println(s4 + 10);






    }
}
