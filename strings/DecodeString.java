class DecodeString {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                st.push(s.charAt(i));
            } else {
                StringBuilder temp = new StringBuilder();
                while (st.peek() != '[') {
                    temp.append(st.pop());
                }
                st.pop();
                int n = 0, place = 1;
                while (!st.empty() && st.peek() >= '0' && st.peek() <= '9') {
                    n += (st.pop() - '0') * place;
                    place *= 10;
                }
                for (int j = 0; j < n; j++) {
                    for (int k = temp.length() - 1; k >= 0; k--) {
                        st.push(temp.charAt(k));
                    }
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.empty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}
