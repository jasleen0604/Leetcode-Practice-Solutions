class Solution {
    public char findTheDifference(String s, String t) {
        
        int sum1 = 0, sum2 = 0;
        
        for(int i=0; i<s.length(); i++)
        {
            sum1 += s.charAt(i);
        }
        for(int i=0; i<t.length(); i++)
        {
            sum2 += t.charAt(i);
        }
        // System.out.println(sum1 + " " + sum2);
        return (char)(sum2 - sum1);
    }
}