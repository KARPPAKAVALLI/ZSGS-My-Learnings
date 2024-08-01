package strings;

public class KPanagram {
    public static boolean kPangram(String str, int k) {
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' ')
                continue;
            freq[c-'a']++;
        }
        int c=0,swap=0;
        for(int i=0;i<26;i++){
            if(freq[i]>1){
                c+=freq[i]-1;
            }
            else if(freq[i]==0){
                swap++;
            }
        }
        if(swap==0||swap>0 && c<=k)
            return true;
        return false;
    }

    public static void main(String[] args) {
        boolean a=kPangram("the quick brown fox jumps over the lazy dog",0);
        System.out.println(a);
    }
}
