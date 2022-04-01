class Solution {
    public void reverseHelper(char[] s, int idx)
    {
        if(idx >= (s.length/2))
            return;
        
        int idx2 = s.length-1-idx;
        //swap
        char temp = s[idx];
        s[idx] = s[idx2];
        s[idx2] = temp;
        
        reverseHelper(s,idx+1);
        
    }
    public void reverseString(char[] s) {
        System.out.println(s.length);
        reverseHelper(s, 0);
    }
}