class lt_14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0]; // 以第一個為基準
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) { // 不符合就縮短
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return ""; // 無公共前綴
            }
        }
        return prefix;
    }
}
