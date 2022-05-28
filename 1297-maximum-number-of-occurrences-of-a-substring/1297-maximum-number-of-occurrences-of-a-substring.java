class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        
        HashMap<String,Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder(s.substring(0, minSize));
        int max = 0;

        hm.put(sb.toString(),1);
        
        for(int i=minSize; i<s.length(); i++)
        {
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            String currStr = sb.toString();
            int uniqueCnt = getUniqueLetterCount(currStr);
            
            if(uniqueCnt <= maxLetters)
            {
                hm.put(currStr, hm.getOrDefault(currStr,0)+1);
                max = Math.max(hm.get(currStr), max); 
            }  
        }
        return max;
    }
    public int getUniqueLetterCount(String str)
    {
        int[] freq = new int[26];
        int ans = 0;
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i) - 'a']++ == 0)ans++;
        }
        return ans;
    }
}