package 코딩테스트연습;

import java.util.Scanner;

public class Bronze2난이도첫번째알파벳구하기 {
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	String word = scan.next();
    	int[] result = new int[26];
    	
    	for (int i = 0; i < result.length; i++) {
			result[i] = -1;
		}
    	
    	for (int i = 0; i < word.length(); i++) {
			char charValue = word.charAt(i);
			int index = charValue -'a';
			if(result[index] == -1) result[index] = i;
		}
    	
    	
    	for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
    	
    	scan.close();

    }
}
