import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int sum1 = 0;
        for(int i=0;i<a;i++){
            int b = sc.nextInt();
            for(int j=0;j<b;j++){
                if(b%(j+1)==0){
                    ++sum;
                }
            }
            if(sum == 2){
                ++sum1;
            }
            sum = 0;
        }
        System.out.print(sum1);
        sc.close();
    }
}