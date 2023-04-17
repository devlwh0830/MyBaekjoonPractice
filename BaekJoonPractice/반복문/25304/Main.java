<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int a = sc.nextInt();
        int sum = 0;
        for (int i=1;i<=a;i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            sum = sum + b * c;
        }
        if(sum == price){System.out.println("Yes");}
        else{System.out.println("No");}
            
        sc.close();
    }
=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int a = sc.nextInt();
        int sum = 0;
        for (int i=1;i<=a;i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            sum = sum + b * c;
        }
        if(sum == price){System.out.println("Yes");}
        else{System.out.println("No");}
            
        sc.close();
    }
>>>>>>> 89e234fdc21b91ab39dfd56782b22eba225b157f
}