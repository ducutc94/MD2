package ngay03;
import java.util.Scanner;
public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so a: ");
        int a = scanner.nextInt();
        System.out.println("Moi nhap so b: ");
        int b = scanner.nextInt();
        System.out.println("Moi nhap so c: ");
        int c = scanner.nextInt();
        int delta = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("PT co vo so  nghiem");
                } else {
                    System.out.println("PT vo nghiem");
                }
            } else {
                double x = (double) -c / b;
                System.out.println("PT co nghiem la: " + x);
            }
        } else if (delta < 0) {
            System.out.println("PT vo nghiem:");

        } else if (delta == 0) {
            double y = (double) -b / (2 * a);
            System.out.println("PT co nghiem kep:" + y);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem la :\n"+"x1= "+x1+ "\n"+"x2= "+x2);
        }
    }
}
