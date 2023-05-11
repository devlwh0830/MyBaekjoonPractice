import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Integer a = scanner.nextInt();
        System.out.println(str.charAt(a-1));
        scanner.close();
    }
}