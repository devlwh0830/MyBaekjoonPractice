import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Integer[] list1 = new Integer[a];
        Integer[] list2 = new Integer[a];

        for(int j=1;j<=a;j++){
            list1[j-1] = j;
            list2[j-1] = j;
        }

        for(int i=0;i<b;i++){
            int x = sc.nextInt(); // 시작
            int y = sc.nextInt(); // 끝
            int m = sc.nextInt(); // 중간값
            // 2 6 5
            // 1 5 4
            m = m - 1;
            y = y - 1;
            x = x - 1;
            for(int h=x;h<=y;h++){
                if(y >= m){
                    list2[h] = list1[m++];
                }else{
                    list2[h] = list1[x++];
                }
            }
            for (int k=0;k<a;k++){
                list1[k] = list2[k];
            }
        }
        for (int g=0;g<a;g++){
            System.out.print(list2[g]+" ");
        }
        sc.close();
    }
}