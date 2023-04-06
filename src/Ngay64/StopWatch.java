package Ngay64;

import java.time.LocalDate;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private  LocalTime endTime;
    public StopWatch(){
        this.startTime=LocalTime.now();

    }

    public LocalTime getStartTime(LocalTime startTime) {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime() {
        this.endTime = endTime;
    }
    public void start(){
        this.startTime=LocalTime.now();
    }
    public void stop(){
        this.endTime=LocalTime.now();

    }
    public void getElapsedTime(){
        int ElapsedTime=(-startTime.toSecondOfDay()+endTime.toSecondOfDay()*100);
        System.out.println("So mili s dem dc la: "+ElapsedTime);
    }
}
