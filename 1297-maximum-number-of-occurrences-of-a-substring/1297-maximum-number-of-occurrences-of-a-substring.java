class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        
        HashMap<String,Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder(s.substring(0, minSize));
        int max = 0;
        if(getUniqueLetterCount(sb.toString()) <= maxLetters)
        {
        hm.put(sb.toString(),1);
        max = 1;
        }
        
        for(int i=minSize; i<s.length(); i++)
        {
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            int uniqueCnt = getUniqueLetterCount(sb.toString());
            
            if(uniqueCnt <= maxLetters)
            {
                hm.put(sb.toString(), hm.getOrDefault(sb.toString(),0)+1);
                max = Math.max(hm.get(sb.toString()), max); 
            }  
        }
        return max;
    }
    public int getUniqueLetterCount(String s)
    {
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<s.length(); i++)
        {
            hs.add(s.charAt(i));
        }
        return hs.size();
    }
}