package Ngay17_04.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BaiTap1 {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        StringBuilder stringBuilder=new StringBuilder();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str=scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i)+"");
        }
        System.out.println(stack);
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(stack.pop());
        }
        System.out.println(stringBuilder);

    }
}
