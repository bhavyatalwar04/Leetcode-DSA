class Solution {
    public String reorganizeString(String s) {
        int n=s.length();
        int[]freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[1]-a[1]);

        for(int i=0;i<26;i++){
            if(freq[i]>(n+1)/2) return "";
            if(freq[i]>0) pq.offer(new int[]{i,freq[i]});
        }
        StringBuilder ans=new StringBuilder();
        while(pq.size()>=2){
            int[]first=pq.poll();
            int[]second=pq.poll();

            ans.append((char)(first[0]+'a'));
            ans.append((char)(second[0]+'a'));

            if(--first[1]>0) pq.offer(first);
            if(--second[1]>0) pq.offer(second);
        }
        if(!pq.isEmpty()) ans.append((char)(pq.poll()[0]+'a'));
        return ans.toString();
    }
}