class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int counter = 1;
        for(int i=0; i<order.length(); i++)
        {
            hm.put(order.charAt(i),counter++);
        }
        
        for(int i=0; i<words.length-1; i++)
        {
            String w1 = words[i];
            String w2 = words[i+1];
            
            int c1 =0, c2 = 0;
            while(c1 < w1.length() && c2 < w2.length())
            {
                char currWordChar = w1.charAt(c1);
                char nextWordChar = w2.charAt(c2);
                
                if(hm.get(currWordChar) > hm.get(nextWordChar)){
                    
                    return false;
                }
                else if(hm.get(currWordChar) < hm.get(nextWordChar)){
                     break;
                }
                c1++;
                c2++;
                if(c2 == w2.length() && c1 < w1.length())
                    return false;
            }
        }
        return true;
    }
}