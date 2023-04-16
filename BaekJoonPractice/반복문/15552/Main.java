import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            int sum = 0 ;
            for(int i=0; i<a;i++){
                String s = br.readLine();
                String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음
                sum = Integer.valueOf(array[0])  +Integer.valueOf(array[1]) ;
                bw.write(String.valueOf(sum)); // 출력
                bw.newLine(); // 줄바꿈
            }
            bw.flush(); // 남아있는 데이터 모두 출력
            bw.close();
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}