package Ngay54;
import java.util.Scanner;
public class DemSoLan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "HelloWorld";
        System.out.println(str.length());
        System.out.println("nhap ki tu muon kiem tra");
        String kiTu = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (kiTu.equals(String.valueOf(str.charAt(i)))){
                count++;
            }
        }
        System.out.println("Ki tu " + kiTu + " co so lan xuat hien la " + count + " lan.");
    }
}
