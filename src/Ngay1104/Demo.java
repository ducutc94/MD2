package Ngay1104;

public class Demo extends Animal implements HaveSwing,NotSwing{
    @Override
    void animal() {
        System.out.println("Thuộc nhóm động vật có cánh hay không có cánh");
    }

    @Override
    public void fly() {
        System.out.println("Hello World");
    }

    @Override
    public void notFly() {
        System.out.println("Hello Earth");
    }

    @Override
    public void swing() {
        System.out.println("Hello Beach");
    }

    @Override
    public void notSwing() {
        System.out.println("Hello Mom");
    }
}
