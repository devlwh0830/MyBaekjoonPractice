import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int g = 0;
        int h= 0;
        int b = 1;

        // 1. 몇번 째 그룹에 속해 있는지 확인
        while(true){
            sum = b * (b+1)/2;
            if(sum >= a){
                break;
            }
            ++b;
        }

        // 그 그룹이 역방향인지 순방향인지 확인
        if(b%2 == 0){ // 역방향 연산
            for(int i=1;i<=b;i++){
                g = i;
                if (sum-a <= sum1){
                    break;
                }
                ++sum1;
            }
            for(int j=b;j>0;j--){
                h = j;
                if (sum-a <= sum2){
                    break;
                }
                ++sum2;
            }
            System.out.print((h)+"/"+(g));
        }
        else{ // 순방향 연산
            for(int i=1;i<=b;i++){
                g = i;
                if (sum-a <= sum1){
                    break;
                }
                ++sum1;
            }
            for(int j=b;j>0;j--){
                h = j;
                if (sum-a <= sum2){
                    break;
                }
                ++sum2;
            }
            System.out.print((g)+"/"+(h));
        }
        sc.close();
    }
}