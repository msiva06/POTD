package January;

import java.util.Stack;

class Pair{
    int first, second; 
    public Pair(int first, int second) 
    { 
        this.first = first; 
        this.second = second; 
    } 
}

// Sum of subarray minimums
public class Problem_20 {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1000000007;
        int n = arr.length;
        int []left = new int[n];
        int []right = new int[n];
 
    Stack<Pair> s1 = new Stack<Pair>();
    Stack<Pair> s2 = new Stack<Pair>();
     
    // getting number of element strictly larger 
    // than A[i] on Left.
    for (int i = 0; i < n; ++i) 
    {
        int cnt = 1;
 
        // get elements from stack until element 
        // greater than A[i] found
        while (!s1.isEmpty() && 
               (s1.peek().first) > arr[i])
        {
            cnt += s1.peek().second;
            s1.pop();
        }
 
        s1.push(new Pair(arr[i], cnt));
        left[i] = cnt;
    }
 
    // getting number of element larger 
    // than A[i] on Right.
    for (int i = n - 1; i >= 0; --i) 
    {
        int cnt = 1;
 
        // get elements from stack until element 
        // greater or equal to A[i] found
        while (!s2.isEmpty() && 
               (s2.peek().first) >= arr[i]) 
        {
            cnt += s2.peek().second;
            s2.pop();
        }
 
        s2.push(new Pair(arr[i], cnt));
        right[i] = cnt;
    }
 
    int result = 0;
 
    // calculating required resultult
    for (int i = 0; i < n; ++i)
        result = (result + (arr[i] * left[i] * 
                                  right[i]) % MOD) % MOD;
 
    return result % MOD;
    }
}
