import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Integer[] arrary = new Integer[a];
        for (int i = 0; i<a;i++){
            int b = sc.nextInt();
            arrary[i] = b;
        }
        int sum = 0;
        int j = sc.nextInt();
        for (int i : arrary){
            if (j == i) {
                sum++;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}