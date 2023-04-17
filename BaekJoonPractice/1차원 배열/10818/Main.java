<<<<<<< HEAD
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
        int max = -1000000;
        int min = 1000000;
        for (int i : arrary){
            max = Math.max(i, max);
        }
        for (int j : arrary){
            min = Math.min(j, min);
        }
        System.out.println(min+" "+max);
        sc.close();
    }
=======
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
        int max = -1000000;
        int min = 1000000;
        for (int i : arrary){
            max = Math.max(i, max);
        }
        for (int j : arrary){
            min = Math.min(j, min);
        }
        System.out.println(min+" "+max);
        sc.close();
    }
>>>>>>> 89e234fdc21b91ab39dfd56782b22eba225b157f
}