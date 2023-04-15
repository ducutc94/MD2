package Ngay1104;

public class Bird  extends Animal implements HaveSwing {
    String name;

    public Bird() {
    }

    @Override
    public void fly() {
        System.out.println("Có thể bay");
    }

    @Override
    public void notFly() {
        System.out.println("Không thể bay");
    }

    @Override
    void animal() {

    }
}
