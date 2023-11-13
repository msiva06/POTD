// Sort vowels in a string
public class Problem_13 {
    public String sortVowels(String s) {
        int[] count = new int[1000];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' ){
                char c = s.charAt(i);
                count[c - 'A']++;
            }
        }  
        String sortedStr = "AEIOUaeiou";
        StringBuilder finalStr = new StringBuilder();
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
               char sorted = sortedStr.charAt(j);
               while(count[sorted - 'A'] == 0){
                   j++;
                   sorted = sortedStr.charAt(j);
               }
               finalStr.append(String.valueOf(sorted));
               count[sorted - 'A']--;
               
            }
            else{
                finalStr.append(s.charAt(i));
            }
        } 
        return new String(finalStr);
    }
}
