package February;

// Find first palindromic string in the array
public class Problem_13 {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            boolean check = palindromeCheck(word);
            if(check){
                return word;
            }
        }
        return "";
    }

    public boolean palindromeCheck(String word){
        int left = 0, right = word.length()-1;
        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
