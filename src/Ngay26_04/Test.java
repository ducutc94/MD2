package Ngay26_04;

import Ngay26_04.DaLuong.PrintChar;
import Ngay26_04.DaLuong.PrintNum;

public class Test {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        Runnable printA=new PrintChar('a',10);
        Runnable printB=new PrintChar('b',10);
        Runnable printNum=new PrintNum(10);
        Thread thread=new Thread(printA);
        Thread thread1=new Thread(printB);
        Thread thread2=new Thread(printNum);
        thread.start();
        //Không thể gọi lại 1 phương thức start
//        thread.start();
        thread1.start();
        thread2.start();
    }
}
