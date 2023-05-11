import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nanu = 2;
        int a = sc.nextInt();
        while(true){
            if(a == 1){
                break;
            }
            if(a%nanu != 0){
                nanu++;
            }else{
                a = a/nanu;
                System.out.println(nanu);
            }

        }
        sc.close();
    }
}