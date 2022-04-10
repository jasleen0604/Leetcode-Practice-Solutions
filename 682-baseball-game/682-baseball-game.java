class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<ops.length; i++)
        {
            String op = ops[i];
            if(op.equals("D"))
            {
                int curr = st.peek();
                st.push(curr*2);   
            }
            else if(op.equals("C"))
            {  
               st.pop();   
            }
            else if(op.equals("+"))
            {
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.push(a+b); 
            }
            else
            {
                st.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        while(st.size() != 0)
        {
            // System.out.println(st.peek());
           sum += st.pop(); 
        }
            
        
        return sum;
    }
}