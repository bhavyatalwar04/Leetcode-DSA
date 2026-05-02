class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;

        Map<Character,Integer>counter=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            counter.put(c,counter.getOrDefault(c,0)+1);
        }

        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(!counter.containsKey(c) || counter.get(c)==0) return false;
            counter.put(c,counter.get(c)-1);
        }
        return true;

    }
}