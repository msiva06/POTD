package January;

import java.util.Stack;

// Reverse polish notation
public class Problem_29 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int op1 = stack.pop();
                int op2 = stack.pop();
                if(tokens[i].equals("+")){
                    ans = op1 + op2;
                }
                if(tokens[i].equals("-")){
                    ans = op2 - op1;
                }
                if(tokens[i].equals("*")){
                    ans = (op1 * op2); 
                }
                if(tokens[i].equals("/")){
                    ans = (op2 / op1);
                }
                stack.push(ans);
            }
            else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
