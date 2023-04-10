package Ngay74.BtapCuaNgu;

public class PartTime extends Employee{
    int wordTime;

    public PartTime(int wordTime) {
        super();
        this.wordTime = wordTime;
    }
    public PartTime(){

    }

    public PartTime(int id, String name, int age, int wordTime) {
        super(id, name, age);
        this.wordTime = wordTime;
    }

    public int getWordTime() {
        return wordTime;
    }

    public void setWordTime(int wordTime) {
        this.wordTime = wordTime;
    }
}
