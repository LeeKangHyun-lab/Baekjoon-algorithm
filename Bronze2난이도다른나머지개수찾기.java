package 코딩테스트연습;

import java.util.Scanner;

public class Bronze2난이도다른나머지개수찾기 {
	
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int[] arr = new int[10];
    	int index = 0;
    	for(int i = 0; i < 10; i++ ) {
    		int num = scan.nextInt();
    		int remain = num % 42;
    		boolean isSame = false;
    		for (int j = 0; j < arr.length; j++) {
    			if(arr[j] == remain) {
    				isSame = true;
    				break;
    			}
				
    			
			}
    		if(!isSame) {
    			arr[index] = remain;
    			index++;
    			
    		}
    		
    	}
    	
    	System.out.println(index);
    	
    	
		
    	scan.close();
    }
}
