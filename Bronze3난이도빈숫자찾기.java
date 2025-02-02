package 코딩테스트연습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 

public class Bronze3난이도빈숫자찾기 {

    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	ArrayList<Integer> list = new ArrayList<>();
    	
    	int[] arr = new int[28];
    	for (int i = 0; i < 28; i++) {
			int n = scan.nextInt();
			arr[i] = n;
		}
    	Arrays.sort(arr);
    	
    	int wrongNum = 1;
    	for (int i = 0; i < arr.length; i++) {
			while(wrongNum < arr[i]) {
				list.add(wrongNum);
				wrongNum++;
			}
			wrongNum++;
		}
    	
    	while (wrongNum <= 30) {
    	    list.add(wrongNum);  
    	    wrongNum++;  
    	}

    	
    	for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
    		
		}
    	scan.close();
    }
}
