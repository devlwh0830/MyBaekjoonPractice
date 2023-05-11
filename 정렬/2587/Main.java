import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] list = new Integer[5];
        int sum = 0;
        for(int i=0;i<5;i++){
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        for(int i:list){
            sum += i;
        }
        System.out.println(sum/5);
        System.out.println(list[2]);
        sc.close();
    }
}