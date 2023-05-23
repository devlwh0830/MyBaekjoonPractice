import java.util.*;

public class Main_2 {
    public static void main(String[] args) { // 두번째 풀이
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<String>();
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        int cnt = 0;
        int abc = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<abc;i++){
            String a = sc.nextLine();
            String[] b = a.split(" ");
            hashSet.add(b[0]);
            hashSet.add(b[1]);

            if(hashMap.containsKey(b[0])){
                if(hashMap.get(b[0])==1){
                    hashMap.put(b[1],1);
                    continue;
                }
            }
            if(hashMap.containsKey(b[1])){
                if(hashMap.get(b[1])==1){
                    hashMap.put(b[0],1);
                    continue;
                }
            }
            if(b[0].equals("ChongChong")){
                hashMap.put(b[0],1);
                hashMap.put(b[1],1);
            }
            else if(b[1].equals("ChongChong")){
                hashMap.put(b[1],1);
                hashMap.put(b[0],1);
            }
            else{
                hashMap.put(b[0],0);
                hashMap.put(b[1],0);
            }
        }
        Iterator<String> iter = hashSet.iterator();
        while(iter.hasNext()){
            if(hashMap.get(iter.next())==1){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}