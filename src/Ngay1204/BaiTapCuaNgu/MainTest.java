package Ngay1204.BaiTapCuaNgu;

import java.util.Arrays;
import java.util.Scanner;

public class MainTest {
    static Scanner scanner = new Scanner(System.in);

    public static Person[] creatPerson() {
        System.out.println("Mời nhập số người:");
        int size = Integer.parseInt(scanner.nextLine());
        return new Person[size];
    }

    public static Person[] addMember(Person[] person, Scanner scanner, Address[] addresses) {
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
            System.out.println("Mời nhập tên: ");
            person[i].setName(scanner.nextLine());
            System.out.println("Mơ nhập tuổi: ");
            person[i].setAge(Integer.parseInt(scanner.nextLine()));
            for (Address k : addresses) {
                System.out.println(k);
            }
            System.out.println("Mời nhập lựa chọn địa chỉ:");
            int choice = Integer.parseInt(scanner.nextLine());
            for (Address p : addresses)
                if (choice == p.getId()) {
                    person[i].setAddress(p);
                }

        }return person;
    }

    public static void display(Person[] person) {
        Arrays.sort(person);
        for (Person k : person) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {

        Person[] person;
        Address newAddress = new Address("Hà Nội");
        Address newAddress1 = new Address("Hà Nam");
        Address newAddress2 = new Address("Hải Phòng");
        Address newAddress3 = new Address("Nam Định");
        Address newAddress4 = new Address("Nghệ An");
        Address[] addresses = {newAddress, newAddress1, newAddress2, newAddress3, newAddress4};
        person = creatPerson();
        display( addMember(person, scanner, addresses));

    }
    public static void displayAddress(Person[] person, Scanner scanner){
        String address=scanner.nextLine();


    }
}
