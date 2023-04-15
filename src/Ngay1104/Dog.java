package Ngay1104;

public class Dog  implements NotSwing{

    public Dog() {
    }

    @Override
    public void swing() {
        System.out.println("Có thể bơi");
    }

    @Override
    public void notSwing() {
        System.out.println("Không thể bơi");

    }
}
