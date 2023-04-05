package Ngay54;

public class HinhChuNhat {
    double width;
    double height;

    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getArea() {
        double area;
        area = this.height * this.width;
        return "Dien tich cua hinh chu nhat la: "+area;
    }

    public String getPerimeter() {
        double perimeter;
        perimeter = (this.height + this.width) * 2;
        return "Chu vi cua hinh chu nhat la: "+perimeter;
    }
    public String display() {
        return "HinhChuNhat{" +
                "Chieu rong =" + width +
                ", Chieu dai =" + height +
                '}';
    }
}
