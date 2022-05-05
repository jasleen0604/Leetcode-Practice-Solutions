class MyStack {
    Queue<Integer> mq = new ArrayDeque<>();
    Queue<Integer> cq = new ArrayDeque<>();
    
    public MyStack() {
        mq = new ArrayDeque<>();
        cq = new ArrayDeque<>();
    }
    
    public void push(int x) {
        cq.add(x);
        while(mq.size() != 0)
        {
            cq.add(mq.remove());
        }
        mq = cq;
        cq = new ArrayDeque<>();
        
    }
    
    public int pop() {
        return mq.remove();
    }
    
    public int top() {
        return mq.peek();
    }
    
    public boolean empty() {
        if(mq.size() == 0)
            return true;
        else
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */