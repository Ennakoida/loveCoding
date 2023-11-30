class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        for(int i = 0; i < dic.length; i++){
            int cnt = 0;
            for(int j = 0; j < spell.length; j++){
                for(int k = 0; k < dic[i].length(); k++){
                    if(spell[j].equals(dic[i].substring(k, k+1))) {
                        cnt++;
                        break;
                    }
                }
            }
            
            if(cnt == spell.length) return 1;
        }
        
        return 2;
    }
}