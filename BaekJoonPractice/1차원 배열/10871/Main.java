<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int j = sc.nextInt();
        Integer[] arrary = new Integer[a];
        for (int i = 0; i<a;i++){
            int b = sc.nextInt();
            arrary[i] = b;
        }
        for (int i : arrary){
            if (i < j){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int j = sc.nextInt();
        Integer[] arrary = new Integer[a];
        for (int i = 0; i<a;i++){
            int b = sc.nextInt();
            arrary[i] = b;
        }
        for (int i : arrary){
            if (i < j){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
>>>>>>> 89e234fdc21b91ab39dfd56782b22eba225b157f
}