package strings;

public class KPanagram {
    boolean kPangram(String str, int k) {
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' ')
                continue;
            freq[c-'a']++;
        }
        int swap=0,avail=0;
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                swap++;
            }
            else if(freq[i]>1){
                avail+=freq[i]-1;
            }
        }
        if(avail>=swap){
            if(swap<=k){
                return true;
            }
        }
        return false;
    }
}
