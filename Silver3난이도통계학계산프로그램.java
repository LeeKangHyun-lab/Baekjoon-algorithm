package 코딩테스트연습;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Silver3난이도통계학계산프로그램 {
		 public static void main(String[] args){
			ArrayList<Integer> list = new ArrayList<>();
			HashMap<Integer, Integer> cntMap = new HashMap<>();
		    Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt();
		    double sum = 0;
		    int range = 0;
		    int middle = 0;
		    int max = 0;
		    int index = 0;
		    boolean isSame = true;
		    if(n % 2 != 0) {
		    	for (int i = 0; i < n; i++) {
					list.add(scan.nextInt());
				}
		    	
		    	Collections.sort(list);
		    	
		    	for (int i = 0; i < list.size(); i++) {
					sum += list.get(i);
					if(cntMap.containsKey(list.get(i))) {
						cntMap.put(list.get(i), cntMap.get(list.get(i)) + 1);
					}
					else {
						cntMap.put(list.get(i), 1);
					}
				}
		    	ArrayList<Integer> maxValues = new ArrayList<Integer>();
		    	
		    	for (Entry<Integer, Integer> num : cntMap.entrySet()) {
					if(Collections.max(cntMap.values()) == num.getValue()) {
						maxValues.add(num.getKey());
					}
				}
		    	
		    	System.out.println();
		    	System.out.println(Math.round(sum / n));
		    	System.out.println(list.get(list.size() / 2));
		    	
		    	if(maxValues.size() > 1) {
		    		Collections.sort(maxValues);
			    	System.out.println(maxValues.get(1));
		    	}
		    	else System.out.println(maxValues.get(0));
		    	
		    	System.out.println(Math.abs(Collections.max(list) - Collections.min(list)));
		    	

		    }
		    
		    else {
		    	System.out.println("홀수를 입력해주세요.");
		    }
		    	
	    }
	

}
