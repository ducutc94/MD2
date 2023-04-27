package Ngay26_04.DaLuong;

public class Creat {
    public static void main(String[] args) {
        //Cách 1
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });thread.start();
        //Cách 2
        new Thread(new Runnable() {
            @Override
            public void run() {
            //Lệnh
            }
        }).start();
        //Cách 3
        new Thread(() -> {
        //Lệnh
        }).start();
    }
}
