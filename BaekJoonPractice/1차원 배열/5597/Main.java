import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int [] arr1 = new int[30];
		int [] arr2 = new int[28];
        
        for(int i=0;i<arr1.length;i++) {
            arr1[i]=i+1;		 			
        }

        for(int i=0;i<arr2.length;i++) {
            arr2[i]=in.nextInt();      		
        }
        in.close();

        for(int i=0;i<30;i++) {   			
            for(int j=0;j<28;j++) {
                if(arr1[i]==arr2[j]) {
                    arr1[i]=0;				
                    
                }
            }
        }					
        
        for(int i=0; i<30;i++) {
            if(arr1[i]!=0) {
                
                System.out.println(arr1[i]);
            }
            
        }

    }

}