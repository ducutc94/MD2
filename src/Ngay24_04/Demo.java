package Ngay24_04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        File file = new File("Demo.txt");
        System.out.println(file.exists());
        try {
            Scanner scanner;
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String firstName = scanner.next();
                String mi = scanner.next();
                String lastName = scanner.next();
                int a = scanner.nextInt();
                System.out.println(firstName + " " + mi + " " + lastName + " " + a);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        String str = "File Handling in Java using "+

                " FileWriter and FileReader";
        try {
            FileWriter fw = new FileWriter("Demo.txt",true);
            for (int i = 0; i < str.length(); i++)

                fw.write(str.charAt(i));

            System.out.println("Writing successful");
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
