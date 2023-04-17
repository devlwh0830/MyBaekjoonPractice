import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer d = scanner.nextInt();
        for (int i=0; i<d; i++){
            String str = scanner.next();
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }
        scanner.close();
    }
}