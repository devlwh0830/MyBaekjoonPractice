import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float sum = 0;
        for(int i=0;i<a;i++){
            int b = sc.nextInt();
            Float[] list = new Float[b];
            for(int j=0;j<b;j++){
                float c = sc.nextFloat();
                list[j] = c;
                sum += c;
            }
            sum = sum/b;
            int y = 0;
            for(float x : list){
                if(x > sum){
                    y++;
                }
            }
            System.out.println(String.format("%.3f", (float)y/(float)b*100f)+"%");
            // 현재 값 / 전체 값 * 100
            sum = 0;
            sc.close();
        }

    }

}