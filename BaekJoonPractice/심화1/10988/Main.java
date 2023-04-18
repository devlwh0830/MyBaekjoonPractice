import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = a.length() - 1;
        boolean result = true;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == a.charAt(b--)) {
                continue;
            }
            else{
                result=false;
                break;
            }
        }
        if (result){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        sc.close();
    }
}