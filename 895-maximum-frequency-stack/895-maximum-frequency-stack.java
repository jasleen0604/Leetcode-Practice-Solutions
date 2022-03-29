class FreqStack {

    HashMap<Integer, Stack<Integer>> hm = new HashMap<>();
    HashMap<Integer,Integer> freqmap = new HashMap<>();
    
    public FreqStack() {
        hm = new HashMap<>();
        freqmap = new HashMap<>();
    }
    
    public void push(int val) {
        int idx = 1;
        if(freqmap.containsKey(val))
        {
            idx = freqmap.get(val);
            idx++;
            freqmap.put(val,idx);
        }
        else
            freqmap.put(val,1);
        
        if(hm.containsKey(idx))
        {
            Stack<Integer> st = hm.get(idx);
            st.push(val);
            hm.put(idx,st);
        }
        else
        {
            Stack<Integer> st = new Stack<>();
            st.push(val);
            hm.put(idx,st);
        }
    }
    
    public int pop() {
        Stack<Integer> st = hm.get(hm.size());
        int res = st.pop();
        
        if(freqmap.get(res) == 1)
            freqmap.remove(res);
        else
            freqmap.put(res,freqmap.get(res)-1);
        
        if(st.size()== 0)
        hm.remove(hm.size());
        
        return res;
        
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */