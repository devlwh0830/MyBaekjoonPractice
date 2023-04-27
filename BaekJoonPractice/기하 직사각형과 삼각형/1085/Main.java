import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        w = w - x;
        h = h - y;
        Integer[] list = {x,y,w,h};
        Arrays.sort(list);
        System.out.print(list[0]);
        sc.close();
    }
}