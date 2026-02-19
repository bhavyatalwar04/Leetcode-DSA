class Solution {
    public int countBinarySubstrings(String s) {

        int res = 0, curr = 1, prev = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                res += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }
        return res + Math.min(prev, curr);
    }
}