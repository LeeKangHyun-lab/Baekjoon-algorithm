package 코딩테스트연습;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bronze3최대값 {

    public static void main(String[] args) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int cnt = Integer.parseInt(bf.readLine());
    	
    	int max = Integer.MIN_VALUE;
    	int min = Integer.MAX_VALUE;
    	
    	
    	String n = bf.readLine();
    	StringTokenizer st = new StringTokenizer(n, " ");
    	while(st.hasMoreTokens()) {
    		int token = Integer.parseInt(st.nextToken());
    		if(token > max) max = token;
    		if(token < min) min = token;
    	}
    	System.out.println(min + " " + max);
    	
    }
}
