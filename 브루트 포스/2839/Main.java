import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = 0;
        int sum = 0;
        int result = 0;
        if(a%5==0){
            sum = a/5;
        }
        if(a%3==0){
            sum = a/3;
        }
        while(true){
            if(a<3){
                break;
            }
            a = a - 5;
            num++;
            if(a%3==0){
                result = num + a/3;
                if(result == 0){
                    break;
                }
            }
        }
        if(sum == 0 && result ==0){
            System.out.print(-1);
        }else{
            if(sum==0){
                System.out.println(result);
            } else if (result==0) {
                System.out.println(sum);
            } else{
                System.out.println(Math.min(result,sum));
            }
        }
        sc.close();
    }
}