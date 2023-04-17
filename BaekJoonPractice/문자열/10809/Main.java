import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f = sc.nextLine();
        for(int i = 'a'; i<='z';i++){
            System.out.print(f.indexOf(i)+ " "); //단어 검색
        }
        sc.close();
    }
}