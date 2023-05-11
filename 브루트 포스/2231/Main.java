import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 1000000;
        for(int i=a;i>=0;i--){
            int sum = 0;
            String c = String.valueOf(i);
            for(int j=0; j<String.valueOf(i).length(); j++){
                String g = String.valueOf(c.charAt(j));
                sum = sum + Integer.parseInt(g);
            }
            int sums = i + sum;
            if(a == sums){
                if (i<result){
                    result = i;
                }
            }
        }
        if(result == 1000000){
            System.out.print(0);
        } else{
            System.out.print(result);
        }
        sc.close();
    }
}