<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arrary = new Integer[9];
        for (int i = 0; i<9;i++){
            int b = sc.nextInt();
            arrary[i] = b;
        }
        int max = 0;
        for (int i : arrary){
            max = Math.max(i, max);
        }
        System.out.println(max);
        for (int j = 0; j<9;j++){
            if (arrary[j] == max){
                System.out.println(j+1);
            }
        }
        
        sc.close();
    }
=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arrary = new Integer[9];
        for (int i = 0; i<9;i++){
            int b = sc.nextInt();
            arrary[i] = b;
        }
        int max = 0;
        for (int i : arrary){
            max = Math.max(i, max);
        }
        System.out.println(max);
        for (int j = 0; j<9;j++){
            if (arrary[j] == max){
                System.out.println(j+1);
            }
        }
        
        sc.close();
    }
>>>>>>> 89e234fdc21b91ab39dfd56782b22eba225b157f
}