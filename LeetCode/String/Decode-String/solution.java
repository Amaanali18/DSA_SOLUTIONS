class Solution {
    public int i = 0;
    public String decodeString(String s) {
        return decode(s);
    }
    public String decode(String s) {
        StringBuilder str = new StringBuilder();
        int num = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
                i++;
            } else if (c == '[') {
                i++;
                String in = decode(s);
                while (num-- > 0) {
                    str.append(in);
                }
                num = 0;
            } else if (c == ']') {
                i++;
                return str.toString();
            } else {
                str.append(c);
                i++;
            }
        }
        return str.toString();
    }
}