package 코딩테스트연습;

import java.util.Scanner;

public class Silver3난이도체스판만들기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.nextLine();
        String[][] chess= new String[x][y];
        
        for (int i = 0; i < x; i++) {
				String color = scan.nextLine();
				for (int j = 0; j < y; j++) {
					chess[i][j] = String.valueOf(color.charAt(j));
				}
		}
        
        int minChange = Integer.MAX_VALUE;
       
        
        for (int i = 0; i <= x - 8; i++) {
			for (int j = 0; j <= y - 8; j++) {
				
				 int Wfirst = 0;
				 int Bfirst = 0;
		        
				for (int k = 0; k < 8 ; k++) {
					for (int s = 0; s < 8 ; s++) {
						if((k + s) % 2 == 0) {
							if(!chess[i + k][j + s].equals("W")) Wfirst++;
							if(!chess[i + k][j + s].equals("B")) Bfirst++;
						}
						else {					
							if(!chess[i + k][j + s].equals("B")) Wfirst++;
							if(!chess[i + k][j + s].equals("W")) Bfirst++;
						}
					}
				}
				minChange = Math.min(minChange, Math.min(Wfirst, Bfirst));
			}
		}
        System.out.println(minChange);
        scan.close();
    }
}
