class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int i=0;
        int len=0;
        for (int j = 0; j < s.length(); j++) {
            freq[s.charAt(j)-'a']++;
            while(freq[s.charAt(j)-'a']>2){
                freq[s.charAt(i)-'a']--;
                i++;
            }
            len=Math.max(len,j-i+1);
        }
        return len;
    }
}