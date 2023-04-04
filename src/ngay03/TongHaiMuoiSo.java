package ngay03;

public class TongHaiMuoiSo {
    public static void main(String[] args) {
        double total = 0;
        int count = 0;
        int uoc = 0;
        int i = 2;
        while (count < 20) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    uoc++;
                }
            }
            if (uoc == 2) {
                count++;
                total += i;
            }
            uoc = 0;
            i++;
        }
        System.out.println(total);
    }
}
