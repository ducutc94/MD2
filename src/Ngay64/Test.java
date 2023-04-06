package Ngay64;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        StopWatch stopwatch=new StopWatch();
        stopwatch.start();
        System.out.println("bat dau dem");
        for (int i = 0; i < 10; i++) {
            stopwatch.stop();
            stopwatch.getElapsedTime();

        }



    }

}
