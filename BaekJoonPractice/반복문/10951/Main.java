import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNext()){
            String a = sc.nextLine();
            String b[] = a.split(" ");
            sum = Integer.valueOf(b[0]) + Integer.valueOf(b[1]);
            System.out.println(sum);
        }
        sc.close();
    }
}