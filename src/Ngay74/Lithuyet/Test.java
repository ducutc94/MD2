package Ngay74.Lithuyet;

public class Test {
    public static void main(String[] args) {
        Parent demo = new Parent();
        Parent demo1 = new Child();
        Child c1=new Child();
        Parent p1=(Parent) c1;
        Child c2=(Child) demo1;
        demo1.m1();
        demo1.m1();
         ((Child) demo1).m2();
         c1.m2();


    }
}
