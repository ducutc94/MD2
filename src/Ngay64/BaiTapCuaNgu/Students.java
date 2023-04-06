package Ngay64.BaiTapCuaNgu;

public class Students {
    String ten;
    int tuoi;
    int diemToan;
    int diemLi;
    int diemHoa;

    public Students() {
    }

    public Students(String ten, int tuoi, int diemToan, int diemLi, int diemHoa) {
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

    public int getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public int getDiemLi() {
        return diemLi;
    }

    public void setDiemLi(int diemLi) {
        this.diemLi = diemLi;
    }

    public int getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(int diemHoa) {
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