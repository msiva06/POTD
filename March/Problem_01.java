package March;

// Maximum odd binary number
public class Problem_01 {
    public String maximumOddBinaryNumber(String s) {
        int size = s.length();
        StringBuilder sb = new StringBuilder();
        int onesCount = 0;
        for(int i = 0; i < size; i++){
            if(s.charAt(i) == '1'){
                onesCount++;
            }
        }
        
        for(int i = 0; i < size-1; i++){
            if(onesCount > 1){
                sb.append("1");
                onesCount--;
            }
            else{
                sb.append("0");
            }
        }
        sb.append("1");
        return sb.toString();
    }
}
