package Ngay74.BtapCuaNgu;

public class FullTime extends Employee{
    int yearOfExp;

    public FullTime(int yearOfExp) {
        super();
        this.yearOfExp = yearOfExp;
    }

    public FullTime( String name, int age, int yearOfExp) {
        super( name, age);
        this.yearOfExp = yearOfExp;
    }

    public FullTime() {

    }


    public int getYearOfExp() {
        return yearOfExp;
    }

    public void setYearOfExp(int yearOfExp) {
        this.yearOfExp = yearOfExp;
    }

    @Override
    public String toString() {
        return "FullTime{" +
                ", id=" + id +
                ", name='" +name +"'"+
                ", age=" + age +
                " yearOfExp=" + yearOfExp +
                '}';
    }
}
