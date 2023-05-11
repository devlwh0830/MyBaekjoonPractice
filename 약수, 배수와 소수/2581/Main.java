import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=a;i<=b;i++){
            int sum = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    sum++;
                }
            }
            if(sum==2) {
                list.add(i);
            }
        }
        int sosuhap = 0;
        for(int j:list){
            sosuhap += j;
        }
        if(sosuhap == 0){
            System.out.print(-1);
        }
        else{
            System.out.print(sosuhap+"\n"+list.get(0));
        }
        sc.close();
    }
}