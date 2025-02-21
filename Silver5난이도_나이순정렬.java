package 코딩테스트연습;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Silver5난이도_나이순정렬 {
	public static void main(String[] args) throws IOException{
		ArrayList<String[]> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 int n = Integer.parseInt(br.readLine());
		 String[] arr = new String[2];
		 
		 for (int i = 0; i < n; i++) {
			arr = br.readLine().split(" ");
			list.add(arr);
		}
		
		
//		Collections.sort(list, new Comparator<String[]>(){
//			
//			public int compare(String[] p1, String[] p2) {
//				return Integer.compare(Integer.parseInt(p1[0]), Integer.parseInt(p2[0]));
//			}
//		});
		
		 Collections.sort(list, Comparator.comparingInt(member -> Integer.parseInt(member[0])));
		
		for(String[] s : list) {
			bw.write(s[0] + " " + s[1] + "\n");
		}
		
		 
		 
		 bw.flush();
		 bw.close();
		 br.close();
	}
}
