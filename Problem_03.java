// Build array with stack operations
public class Problem_03 {
    public List<String> buildArray(int[] target, int n) {
        List<String> ops = new ArrayList<>();
        int idx = 0;
        for(int num : target){
            while(idx < num -1){
                ops.add("Push");
                ops.add("Pop");
                idx++;
            }
            ops.add("Push");
            idx++;
        }
        return ops;
    }
}
