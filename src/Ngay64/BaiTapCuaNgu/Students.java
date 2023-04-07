package Ngay64.BaiTapCuaNgu;

public class Students {
    String ten;
    int tuoi;
    double diemToan;
    double diemLi;
    double diemHoa;

    public Students() {
    }

    public Students(String ten, int tuoi, double diemToan, double diemLi, double diemHoa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemLi = diemLi;
        this.diemHoa = diemHoa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLi() {
        return diemLi;
    }

    public void setDiemLi(double diemLi) {
        this.diemLi = diemLi;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    @Override
    public String toString() {
        return "Students{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diemToan=" + diemToan +
                ", diemLi=" + diemLi +
                ", diemHoa=" + diemHoa +
                '}';
    }
}