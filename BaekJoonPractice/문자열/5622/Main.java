import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		String str = new String();
		str = in.next();
		
		String[] alpha = new String[8];
				
		alpha[0] = "ABC"; // 2 / 3초
		alpha[1] = "DEF"; // 3 / 4초
		alpha[2] = "GHI"; // 4 / 5초
		alpha[3] = "JKL"; // 5 / 6초
		alpha[4] = "MNO"; // 6 / 7초
		alpha[5] = "PQRS"; // 7 / 8초
		alpha[6] = "TUV"; // 8 / 9초
		alpha[7] = "WXYZ"; // 9 / 10초
		
		int TotalSecond = 0; //총 걸리는 시간
        for(int i=0;i<str.length();i++){
            for(int x=0;x<8;x++){
                for(int j=0;j<alpha[x].length();j++){
                    if(str.charAt(i) == alpha[x].charAt(j)){
                        TotalSecond += x+3;
                    }
                }
            }
        }
        System.out.println(TotalSecond);
        in.close();
    }
}