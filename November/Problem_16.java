package November;
// Find Unique Binary String
public class Problem_16 {
    Set<String> hash = new HashSet<String>();
    public String findDifferentBinaryString(String[] nums) {
        for(String s : nums){
            hash.add(s);
        }
        return generate("",nums);
    }

    public String generate(String curr,String[] nums){
        if(curr.length() == nums.length){
            if(!hash.contains(curr))
                return curr;
            return "";
        }
        String addZero= generate(curr+"0",nums);
        if(addZero.length() > 0)
            return addZero;
        return generate(curr+"1",nums);
    } 
}
