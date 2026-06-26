class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st = 0, max = 0;
        int[] arr = new int[256];

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            arr[ch]++;

            while (arr[ch] > 1) {
                arr[s.charAt(st)]--;
                st++;
            }
            max = Math.max(max, end - st + 1);
        }
        return max;
    }
}