class lt_09 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rev = 0, original = x;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        return rev == original;
    }
}
