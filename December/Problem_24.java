package December;

// Min changes to make alternate binary string
public class Problem_24 {
    public int minOperations(String s) {
        int op = 0;
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                if(s.charAt(i) == '1')
                    op++;
            }
            else{
                if(s.charAt(i) == '0')
                    op++;
            }
        }
        return Math.min(op,s.length() - op);
    }
}
