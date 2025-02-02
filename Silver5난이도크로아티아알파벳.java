package 코딩테스트연습;

import java.util.Scanner;

public class Silver5난이도크로아티아알파벳 {
	 public static void main(String[] args)  {
		 Scanner scan = new Scanner(System.in);
	    	
	    	String[] list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	      	
	    	String word = scan.next();
	    	int cnt = 0;
	    	
	    	for(String pattern : list) {
	    		while(word.contains(pattern)) {
	    			word = word.replaceFirst(pattern, " ");
	    			cnt++;
	    		}
	    	}
	    	word = word.replace(" ", "");
	    	cnt += word.length();
	    	System.out.println(cnt);
	    	scan.close();
	}
}
