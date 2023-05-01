import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Integer[] list = new Integer[a.length()];
        for(int i=0;i<a.length(); i++){
            list[i] = (int) a.charAt(i) - '0';
        }
        Arrays.sort(list);
        for(int i=list.length-1;i>=0;i--){
            System.out.print(list[i]);
        }
        sc.close();
    }
}