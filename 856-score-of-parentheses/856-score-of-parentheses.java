class Solution {
    public int scoreOfParentheses(String s) {
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                st.push(0);
            }
            else
            {
                if(st.peek() == 0)
                {
                    st.pop();
                    st.push(1);
                }
                else
                {
                    int sum = 0;
                    while(st.size() > 0 && st.peek() != 0)
                    {
                        sum += st.pop();
                    }  
                    if(st.size() > 0)
                        st.pop();
                    
                    System.out.println(sum);
                    st.push(sum*2);
                }    
            }
        }
        int score = 0;
        while(st.size() > 0)
            score += st.pop();
        
        return score;
    }
}