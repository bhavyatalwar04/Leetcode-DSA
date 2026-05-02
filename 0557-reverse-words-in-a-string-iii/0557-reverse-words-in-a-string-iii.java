class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                word.append(ch);
            } else {
                res.append(word.reverse()).append(" ");
                word.setLength(0);
            }
        }
        res.append(word.reverse());
        return res.toString();
    }
}