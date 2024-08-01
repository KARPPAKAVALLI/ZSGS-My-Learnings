class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder prev=new StringBuilder("1");
        StringBuilder curr=new StringBuilder("");
        for(int i = 1; i < n; i++) {
            curr=new StringBuilder("");
            int j=0,k;
            while (j<prev.length()){
                k=j+1;
                int count=1;
                while (k<prev.length() && prev.charAt(j)==prev.charAt(k)){
                    k++;
                    count++;
                }
                curr.append(count);
                curr.append(prev.charAt(j));
                j=k;
            }
            prev=curr;
        }
        return prev.toString();
    }
}
