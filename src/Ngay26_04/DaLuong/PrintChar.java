package Ngay26_04.DaLuong;

public class PrintChar implements Runnable{
    private char aChar;
    private int time;

    public PrintChar(char a, int t) {
        this.aChar=a;
        this.time=t;
    }

    @Override
    public void run() {
        for (int i = 0; i <time ; i++) {
            System.out.println(aChar);

        }
    }
}
