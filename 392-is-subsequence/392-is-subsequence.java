class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;
        
        int ptr1 = 0, ptr2 = 0;
        while(ptr2 < t.length())
        {
            char ch1 = s.charAt(ptr1);
            char ch2 = t.charAt(ptr2);
            
            if(ch1 == ch2)
            {
                ptr1++;
            }
            ptr2++;
            if(ptr1 == s.length())
                return true;
        }
        return false;
    }
}