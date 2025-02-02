package 코딩테스트연습;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer; 

public class Bronze2난이도바구니뒤집기 {
	public static void main(String[] args) throws IOException{
//    	Scanner scan = new Scanner(System.in);
//    	
//    	int n = scan.nextInt();
//    	int[] arr = new int[n];
//    	int m = scan.nextInt();
//    	
//    	for (int i = 0; i < arr.length; i++) {
//			arr[i] = i+1;
//		}
//    	
//    	for (int i = 0; i < m; i++) {
//			int ch1 = scan.nextInt() - 1;
//			int ch2 = scan.nextInt() - 1;
//			int temp = 0;
//			
//			while(ch1 < ch2){
//			temp = arr[ch1];
//			arr[ch1] = arr[ch2];
//			arr[ch2] = temp;
//			ch1++;
//			ch2--;
//			}
//		}
//    	for (int i = 0; i < arr.length; i++) {
//    		System.out.print(arr[i] + " ");
//			
//		}
//    	
//    	scan.close();
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	
    	int[] arr = new int[n]; 
    	
    	for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
    	
    	for (int i = 0; i < m; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
			int temp = 0;
			int ch1 = Integer.parseInt(st.nextToken()) - 1;
			int ch2 = Integer.parseInt(st.nextToken()) - 1;
			
			while(ch1 < ch2) {
				temp = arr[ch1];
				arr[ch1]= arr[ch2];
				arr[ch2] = temp;
				ch1++;
				ch2--;
			}
		}
    	
    	for (int i = 0; i < arr.length; i++) {
    		bw.write(arr[i]);
		}
    	bw.flush();
    	br.close();
    	bw.close();
    }
}
