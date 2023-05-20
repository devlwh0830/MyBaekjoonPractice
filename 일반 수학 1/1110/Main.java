import java.util.Scanner;

public class Main_5 {
    public static void main(String[] args) { // 더하기 사이클
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        if(N < 10){
            N = N * 10;
        }
        int sum = 0;
        int cnt = 0;
        String result = N.toString();
        while(true){
            if(N == 0){
                cnt++;
                break;
            }
            if(sum == N){
                break;
            }
            sum = (int)result.charAt(0)-'0' + (int)result.charAt(1)-'0';
            if(sum >= 10){
                sum = sum%10;
                if(sum==0){
                    sum = (((int)result.charAt(1)-'0')*10);
                }else{
                    sum = (((int)result.charAt(1)-'0')*10) + sum;
                }
            }else{
                sum = (((int)result.charAt(1)-'0')*10) + sum;
            }
            result = String.valueOf(sum);
            if(result.length() == 1){
                cnt++;
                result = String.valueOf(sum*11);
                sum = sum*11;
            }
            cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}