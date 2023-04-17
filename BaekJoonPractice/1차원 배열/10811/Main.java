<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arrary = new int[a]; 
        int[] arrarys= new int[a]; 
        for (int i = 0; i < a;i++){
            arrary[i] = i + 1;
            arrarys[i] = i + 1;
        }
        for(int j=0;j<b;j++){
            int x = sc.nextInt();
            int g = x - 1;
            int y = sc.nextInt();
            for(int k = 0;k<a;k++){
                arrary[k] = arrarys[k];
            }
            for(int s = y-1;s>=x-1;s--){
                arrarys[g] = arrary[s];
                g++;
            }
        }
        for(int c : arrarys){
            System.out.print(c+" ");
        }
        sc.close();
    }
=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arrary = new int[a]; 
        int[] arrarys= new int[a]; 
        for (int i = 0; i < a;i++){
            arrary[i] = i + 1;
            arrarys[i] = i + 1;
        }
        for(int j=0;j<b;j++){
            int x = sc.nextInt();
            int g = x - 1;
            int y = sc.nextInt();
            for(int k = 0;k<a;k++){
                arrary[k] = arrarys[k];
            }
            for(int s = y-1;s>=x-1;s--){
                arrarys[g] = arrary[s];
                g++;
            }
        }
        for(int c : arrarys){
            System.out.print(c+" ");
        }
        sc.close();
    }
>>>>>>> 89e234fdc21b91ab39dfd56782b22eba225b157f
}