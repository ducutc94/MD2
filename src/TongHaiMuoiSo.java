public class TongHaiMuoiSo {
    public static void main(String[] args) {
        double total = 0;
        int count = 0;
        int uoc = 0;
//        while (count < 3) {
            for (int i = 2; i < 500; i++) {
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
                if(count>20){
                    break;
                }
            }
//        }
        System.out.println(total);
    }
}
