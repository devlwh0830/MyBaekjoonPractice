import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Integer[] list = new Integer[a];
        for(int i=0;i<a;i++){
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        System.out.print(list[list.length-b]);
        sc.close();
    }
}