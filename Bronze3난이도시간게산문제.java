package 코딩테스트연습;
import java.util.Scanner;

public class Bronze3난이도시간게산문제 {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int x = scan.nextInt();
	        int y = scan.nextInt();
	        int z = scan.nextInt();
	        
	        int totalMinutes = x * 60 + y + z;
	        int newHour = (totalMinutes / 60) % 24;
	        int newMinutes = totalMinutes % 60;
	        
	        
	        System.out.println(newHour + " "+ newMinutes);
	        scan.close();
	    }
}      


