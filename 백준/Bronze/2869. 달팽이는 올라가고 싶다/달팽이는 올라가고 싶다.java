import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());
        double V = Integer.parseInt(st.nextToken());
        
        double date = ((V-A)/(A-B)) + 1;
        
        System.out.println((int)Math.ceil(date));
    }
}