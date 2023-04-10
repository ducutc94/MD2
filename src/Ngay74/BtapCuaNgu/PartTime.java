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

    @Override
    public String toString() {
        return "PartTime{" +
                ", id=" + id +
                ", name='" + this.name + '\'' +
                ", age=" + age +
                " wordTime=" + wordTime +
                '}';
    }
}
