package MiniTest.model;

public class Students extends People {
    private double averagePoint;
    public Students(String name, String age, double averagePoint) {
        super(name, age);
        this.averagePoint = averagePoint;
    }
    @Override
    public String toString() {
        return super.toString()+
                "averagePoint=" + averagePoint ;
    }
    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }
}
