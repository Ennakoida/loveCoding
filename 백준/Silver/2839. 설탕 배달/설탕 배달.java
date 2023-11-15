import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int N = Integer.parseInt(br.readLine());
	    int cnt = 0, five = 0, three = 0, i = 1;
	    
	    five = N / 5;
	    three = (N % 5) / 3;
	    
	    while(((5 * five) + (3 * three)) != N){
	        if(five == 0) {
	            cnt = -1; 
	            break;
	        }
	        
	        five -= 1;
	        three = ((N % 5) + (5 * i)) / 3;
	        i++;
	    }
	    
	    if(cnt != -1){
	        cnt = five + three;
	    }
	    
	    System.out.println(cnt);
	}
}
