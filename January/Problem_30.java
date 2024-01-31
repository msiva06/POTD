package January;

import java.util.Stack;

// Daily temperatures
public class Problem_30 {
    public int[] dailyTemperatures(int[] temperatures) {
        int t = temperatures.length;
        int[] res = new int[t];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i =0 ; i < t; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int span = i - stack.peek();
                res[stack.peek()] = span;
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }
}
