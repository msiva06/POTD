package February;

// Power of 2
public class Problem_18 {
    public boolean isPowerOfTwo(int n) {
        if(n == 0)
            return false;
        long x = (long) n;
        return (x & (x-1)) == 0;
    }
}
