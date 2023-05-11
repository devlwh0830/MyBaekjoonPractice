import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer list[] = {1, 1, 2, 2, 2, 8};
        for(int i=0;i<6;i++){
            Integer b = sc.nextInt();
            if(b == list[i]){
                System.out.print(0+" ");
            }else{
                System.out.print((list[i]-b)+" ");
            }

        }
        sc.close();
    }
}