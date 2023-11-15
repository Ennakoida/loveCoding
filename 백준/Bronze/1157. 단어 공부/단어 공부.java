import java.io.*;
import java.util.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt[] = new int[26];
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch < 'a') cnt[ch - 'A']++;
            else cnt[ch - 'a']++;
        }
        
        int max = -1;
        char result = ' ';
        
        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] > max){
                max = cnt[i];
                result = (char)('A' + i);
            }
            else if(cnt[i] == max) result = '?';
        }
        
        System.out.println(result);
    }
}