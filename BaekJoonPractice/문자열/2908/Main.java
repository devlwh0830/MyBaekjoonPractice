import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        String b = sc.next();
        String result1 = "";
        String result2 = "";
        for(int i = c.length()-1;i>=0; i--){
            result1 += c.charAt(i);
        }
        int result3 = Integer.parseInt(result1);
        for(int i = b.length()-1;i>=0; i--){
            result2 += b.charAt(i);
        }
        int result4 = Integer.parseInt(result2);

        System.out.println(Math.max(result3, result4));
        
        sc.close();
    }
}