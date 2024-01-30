package January;

import java.util.Stack;

// Queue using stacks
public class Problem_29 {
    class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1= new Stack<Integer>();
        s2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        if(!s1.isEmpty())
            return s1.pop();
        return -1;
    }
    
    public int peek() {
        if(!s1.isEmpty())
            return s1.peek();
        return -1;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}
}
