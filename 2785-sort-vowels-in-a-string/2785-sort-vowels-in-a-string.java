class Solution {
    public String sortVowels(String s) {
        ArrayList<Character>chars=new ArrayList<>();
        char[]arr=s.toCharArray();

        for(char c:arr){
            char ch=Character.toLowerCase(c);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') chars.add(c);
        }
        Collections.sort(chars);
        
        int idx=0;
        for(int i=0;i<arr.length;i++){
            char ch=Character.toLowerCase(arr[i]);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') arr[i]=chars.get(idx++);
        }
        return new String(arr);
    }
}