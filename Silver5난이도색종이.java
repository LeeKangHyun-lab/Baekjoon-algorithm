package 코딩테스트연습;

import java.util.Scanner;

public class Silver5난이도색종이 {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int[][] paper = new int[100][100];
    	
    	int amount = scan.nextInt();
    	int cnt = 0;
    	for (int i = 0; i < amount; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			for (int j = x; j < x + 10; j++) {
				for (int j2 = y; j2 < y + 10; j2++) {
					paper[j][j2] = 1;
				}
			}
    	}
    	for (int i = 0; i < paper.length; i++) {
			for (int j = 0; j < paper[i].length; j++) {
				if(paper[i][j] == 1) cnt++;
			}
		}
    	System.out.println(cnt);
	    }
}
