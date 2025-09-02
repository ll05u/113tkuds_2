class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = value(s.charAt(i));
            if (i + 1 < s.length() && val < value(s.charAt(i+1))) sum -= val; // 前小後大減
            else sum += val; // 否則加
        }
        return sum;
    }
    private int value(char c) { // 羅馬字母對應值
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
