package Ngay26_04.DaLuong;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread1: " +i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }) ;
        t.start();
        Thread.sleep(10);
        System.out.println("END");
    }

}
