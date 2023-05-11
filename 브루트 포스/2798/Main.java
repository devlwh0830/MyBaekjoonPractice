import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        int r = 0;
        Integer[] list = new Integer[a];
        for(int i=0;i<a;i++){
            int c = sc.nextInt();
            list[i] = c;
        }
        for(int i=0;i<a-2;i++){
            for(int n=i+1;n<(b-1);n++){
                for(int j=n+1;j<a;j++){
                    r = list[i] + list[n] + list[j];
                    if (r <= b && r > result){
                        result = r;
                    }
                }
            }
        }
        System.out.print(result);
        sc.close();
    }
}