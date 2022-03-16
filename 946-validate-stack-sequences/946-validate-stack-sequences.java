class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> st = new Stack<>();
        
        st.push(pushed[0]);
        int pushCtr = 1;
        int popCtr = 0;
        while(popCtr < popped.length)
        {
            if(st.size() > 0 && popped[popCtr] == st.peek())
            {
                st.pop();
                popCtr++;
            }
            else
            {
                if(pushCtr < pushed.length)
                    st.push(pushed[pushCtr++]);
                else
                    return false;
            }
        }
        return true;
    }
}