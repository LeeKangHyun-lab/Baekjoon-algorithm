package 코딩테스트연습;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bronze3난이도과제한내신분 {
	public static void main(String[] args) throws IOException{
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 28; i++) {
			int student = scan.nextInt();
			list.add(student);
		}
		System.out.println();
		for (int i = 1; i < 30; i++) {
			if(!list.contains(i)) {
				System.out.println(i);
			}
		}
		 
	}
}
