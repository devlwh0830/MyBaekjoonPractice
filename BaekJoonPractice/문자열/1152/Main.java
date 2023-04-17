import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine().trim();
        if (c.isEmpty()){
            System.out.println("0");
        }else{
            System.out.println(c.split(" ").length);
        }
        
        sc.close();
    }
}