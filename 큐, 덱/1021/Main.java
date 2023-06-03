import java.util.Scanner;
import java.util.LinkedList;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> deque = new LinkedList<Integer>();
		
		int count = 0;	// 2, 3번 연산 횟수 누적 합 변수
		
		int N = sc.nextInt();
		int M = sc.nextInt();

		for(int i = 1; i <= N; i++) {
			deque.offer(i);
		}
		
		int[] seq = new int[M];
		for(int i = 0; i < M; i++) {
			seq[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < M; i++) {			

			int target_idx = deque.indexOf(seq[i]);
			int half_idx;

			if(deque.size() % 2 == 0) {
				half_idx = deque.size() / 2 - 1;
			}
			else {
				half_idx = deque.size() / 2;
			}

			if(target_idx <= half_idx) {
				for(int j = 0; j < target_idx; j++) {
					int temp = deque.pollFirst();
					deque.offerLast(temp);
					count++;
				}
			}
			else {	
				for(int j = 0; j < deque.size() - target_idx; j++) {
					int temp = deque.pollLast();
					deque.offerFirst(temp);
					count++;
				}
			}
			deque.pollFirst();	// 연산이 끝나면 맨 앞 원소를 삭제
		}
		System.out.println(count);
		sc.close();
	}
}