import java.util.*;

public class Main {
	public static void main(String[] args) {
        boolean arr[] = new boolean[10001];
        
        for(int i = 0; i < 10000; i++){
            int n = d(i);
            if(n <= 10000) arr[n] = true;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(!arr[i]) System.out.println(i);
        }
    }
    
    public static int d(int n){
        int dn = n;
        while(n > 0) {
			dn += n % 10;
			n /= 10;
		}
        return dn;
    }
}

