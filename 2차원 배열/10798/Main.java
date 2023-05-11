import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character[][] list = new Character[5][15];
        int max = 0;
        for(int i=0;i<5;i++) {
            String str = sc.nextLine();
            if (max < str.length()) max = str.length();
            for (int j = 0; j < str.length(); j++) {
                list[i][j] = str.charAt(j);
            }
        }
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if (list[j][i] == null){
                    continue;
                }
                else {
                    System.out.print(list[j][i]);
                }
            }
        }
        sc.close();
    }
}