import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[][] list = new Integer[9][9];

        for(int i = 0; i<9;i++){
            for(int j=0;j<9;j++){
                int a = sc.nextInt();
                list[i][j] = a;
            }
        }
        int sum = 0;
        for(int i=0; i<9;i++){
            for(int j=0;j<9;j++){
                sum = Math.max(list[i][j],sum);
            }
        }
        System.out.println(sum);
        int x = 0;
        int y = 0;
        for(int i=0; i<9;i++){
            for(int j=0;j<9;j++){
                if(sum == list[i][j]){
                    x = ++i;
                    y = ++j;
                    break;
                }
            }
        }
        System.out.print(x+" "+y);
        sc.close();
    }
}