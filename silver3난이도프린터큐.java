package 코딩테스트연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class silver3난이도프린터큐 {
	 public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		 int testCase = Integer.parseInt(br.readLine());
		 
		 for (int i = 0; i < testCase; i++) {
			 String num = br.readLine();
			 StringTokenizer st = new StringTokenizer(num, " ");
			 
			 int wordNum = 0;
			 int findNum = 0;
			 wordNum = Integer.parseInt(st.nextToken());
			 findNum = Integer.parseInt(st.nextToken());
			 
			 Queue<int[]> que = new LinkedList<>();
			 
			 st = new StringTokenizer(br.readLine(), " ");
			 for (int j = 0; j < wordNum; j++) {
				int value = Integer.parseInt(st.nextToken());
				int[] arr = {j, value};
				 que.offer(arr);
			}
			 int cnt = 0;
			 while(!que.isEmpty()) {
				 boolean isMax = true;
				 
				 for (int[] compareQ : que) {
					 if(que.peek()[1] < compareQ[1]) {
						 isMax = false;
						 break;
					 }
				 }
				 
				 if(isMax) {
					 cnt++;
					 if(que.peek()[0] == findNum) {
						 System.out.println(cnt);
						 break;
					 }
					 que.poll();
				 }
				 else {
					 que.offer(que.poll());
				 }
				 
			 }
			 
			 
		 }
	 }
}
