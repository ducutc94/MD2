package Ngay21_04;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputValue(104);
    }

    static void inputValue(int value) {
        if (value > 100) {
            throw new RuntimeException();
        }

    }
}
