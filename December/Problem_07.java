package December;

// Largest odd number in string
public class Problem_07 {
    public String largestOddNumber(String num) {
        int n = num.length();
          for(int i = n-1; i >= 0; i--){
            int currNo = num.charAt(i) - '0';
            if(currNo % 2 != 0){
              return num.substring(0,i+1);
            }
          }
          return "";
      }
}
