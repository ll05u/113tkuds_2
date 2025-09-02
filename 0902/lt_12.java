class lt_12 {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) { // 從大到小減
                num -= values[i];
                sb.append(symbols[i]); // 拼字串
            }
        }
        return sb.toString();
    }
}
