package 코딩테스트연습;

import java.util.Scanner;

public class Bronze2난이도정수순서바꾸기 {
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int num1 = scan.nextInt();
    	int num2 = scan.nextInt();
    	int reverseNum1 = 0;
    	int reverseNum2 = 0;
    	
    	while(num1 != 0 || num2 != 0) {
    		int lastNum1 = num1 % 10;
    		int lastNum2 = num2 % 10;
    		reverseNum1 = reverseNum1 * 10 + lastNum1;
    		reverseNum2 = reverseNum2 * 10 + lastNum2;
    		num1 = num1 / 10;
    		num2 = num2 / 10;
    	}
    	
    	System.out.println(Math.max(reverseNum1, reverseNum2));
		scan.close();
    }   	
}
