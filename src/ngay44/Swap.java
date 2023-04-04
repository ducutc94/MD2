package ngay44;

public class Swap {
   static int a=5;
   static int b=10;

    public static int swap(int first, int second){
        int team=first;
        first=second;
        second=team;
        return first;
    }

    public static void main(String[] args) {
        swap(a,b);
        System.out.println(swap(a,b));
        System.out.println(b);
    }

}

