import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int a = sc.nextInt();
            if(a == -1){
                break;
            }
            int sum = 0;
            // 약수 구하는 반복문
            for(int i=0;i<a;i++){
                if(a%(i+1)==0){
                    list.add(i+1);
                }
            }
            for(int i:list){
                if(a == i){
                    break;
                }
                sum += i;
            }
            if (a == sum){
                System.out.print(sum+" = ");
                for(int j:list){
                    if(j == list.get(list.size()-2)){
                        System.out.print(j + "\n");
                        break;
                    }else{
                        System.out.print(j+" + ");
                    }
                }
            } else{
                System.out.print(a + " is NOT perfect.\n");
            }
            list.clear();
        }
        sc.close();
    }
}