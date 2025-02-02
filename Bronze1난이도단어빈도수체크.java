package 코딩테스트연습;

import java.util.Scanner;

public class Bronze1난이도단어빈도수체크 {
	public static void main(String[] args)  {
    	Scanner scan = new Scanner(System.in);
    	
    	String word = scan.next();
    	int maxCnt = 0;
    	char maxValue = '0';
    	boolean isSame = false;
    	word = word.toLowerCase();
    	
    	for (int i = 0; i < word.length(); i++) {
			char find = word.charAt(i);
			int cnt = 0;
			
			if(word.indexOf(find) != i) continue;
			
			for (int j = 0; j < word.length(); j++) {
				if(find == word.charAt(j)) 
					cnt++;
			}
			
			if(cnt > maxCnt) {
				maxCnt = cnt;
				maxValue = find;
				isSame = false;
			}
			else if(cnt == maxCnt) {
				maxValue = '?';
				isSame = true;
			}
		}
    	
    	if(isSame) System.out.println('?');
    	else System.out.println(Character.toUpperCase(maxValue));
    	
  
    	scan.close();
    }
}
