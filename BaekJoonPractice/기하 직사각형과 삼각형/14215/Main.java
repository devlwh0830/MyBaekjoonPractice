import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Integer[] list = new Integer[3];

        list[0] = a;
        list[1] = b;
        list[2] = c;
        Arrays.sort(list);
        if((list[0]+list[1]) <= list[2]) {
            if (a == b && b == c && a == c) {
                System.out.println(a + b + c);
            } else {
                int x = list[0] + list[1];
                System.out.print(x + (x - 1));
            }
        } else{
            System.out.print(a+b+c);
        }

        sc.close();
    }
}