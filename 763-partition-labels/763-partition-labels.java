class Solution {
    public List<Integer> partitionLabels(String s) {
        
        int chars[] = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a'] = i;   // storing index positions in array 
        }
        
        int j = 0;
        int go_to_next_char = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            j = Math.max(j , chars[s.charAt(i) - 'a']);
            
            if(j == i) {
                
                // i-go_to_next_char+1
                
                // i is current index position
                // +1 is adding +1 to ans because we want ans as 1based indexing
                // go_to_next_char is char from where we started
                
                  list.add(i-go_to_next_char+1);
                  go_to_next_char = j+1;
            }
        }
        
        return list;
        
    }
}