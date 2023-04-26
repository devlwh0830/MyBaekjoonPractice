import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        // 약수 구하는 반복문
        for(int i=0;i<a;i++){
            if(a%(i+1)==0){
                list.add(i+1);
            }
        }

        // 약수의 b번째 작은 수 구하는 조건문
        if(b <= list.size()){
            System.out.print(list.get(b-1));
        }else{
            System.out.print(0);
        }

        sc.close();
    }
}