import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] list = new Integer[3];
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==0&& b==0&& c==0){
                break;
            }
            list[0] = a;
            list[1] = b;
            list[2] = c;
            Arrays.sort(list);
            if(list[0]+list[1] > list[2]){
                if(a != b && b != c && a != c){
                    System.out.println("Scalene");
                } else if (a == b && b == c && a == c) {
                    System.out.println("Equilateral");
                } else {
                    System.out.println("Isosceles");
                }
            } else{
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}