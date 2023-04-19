package Ngay18_04.baiTapCuaNgu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, String> tuDien = new HashMap<>();
        tuDien.put("Hello", "Xin chào");
        tuDien.put("Bye Bye", "Tạm biệt");
        tuDien.put("Apple", "Quả táo");
        tuDien.put("Run", " Chạy ");
        int choice;
        do {
            System.out.println("---------------");
            System.out.println("-----MENU------");
            System.out.println("1.Thêm từ điển");
            System.out.println("2.Tra từ điển");
            System.out.println("3.Sửa t điển");
            System.out.println("4.Hiển thị từ điển");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:themTuDien(scanner,tuDien);
                    break;
                case 2:traTuDien(scanner,tuDien);
                    break;
                case 3:suaTuDien(scanner,tuDien);
                    break;
                case 4:displayTuDien(tuDien);
                break;
                case 0:
                    System.exit(0);
            }

        } while (choice!=0);
    }
    public static void displayTuDien(Map<String,String> tuDien){
        for (Map.Entry<String,String> k:tuDien.entrySet()){
            System.out.println(k.getKey()+"    có nghĩa là:    "+ k.getValue());
        }

    }

    public static void traTuDien(Scanner scanner,Map<String,String> tuDien) {
        System.out.println("Nhập vào từ cần tra");
        String wordSearch = scanner.nextLine();
        if(tuDien.containsKey(wordSearch)){
            System.out.println("Có nghĩa là: "+tuDien.get(wordSearch));
            return;
        }
        System.out.println("Không tìm thấy");
    }
    public static void themTuDien(Scanner scanner,Map<String,String> tuDien){
        System.out.println("Nhập key mới: ");
        String key=scanner.nextLine();
        System.out.println("Nhập ý nghĩa mới: ");
        String value=scanner.nextLine();
        tuDien.put(key,value);
        System.out.println("Thêm thành công.");
    }
    public static void suaTuDien(Scanner scanner,Map<String,String> tuDien){
        System.out.println("Nhập key cần sửa: ");
       String keySua =scanner.nextLine();
       for (Map.Entry<String,String> mapEntry:tuDien.entrySet()){
           if(mapEntry.getKey().equalsIgnoreCase(keySua)){
               System.out.println("Nhập ý nghĩa mới: ");
               String value=scanner.nextLine();
               tuDien.put(mapEntry.getKey(),value);
               return;
           }
       }
        System.out.println("Không có");

    }

}
