package November;
// Find the winner of an array game
public class Problem_05 {
    public int getWinner(int[] arr, int k) {
        int currWinner = 0, prevWinner = 0, count = 0;
        prevWinner = Math.max(arr[0],arr[1]);
        count = 1;
        if(count == k)
             return prevWinner;
        for(int i = 2; i < arr.length; i++){
            currWinner = Math.max(prevWinner,arr[i]);
            if(currWinner == prevWinner){
                count += 1;
                if(count == k)
                  break;
            }
            else{
                count = 1;
            }
            prevWinner = currWinner; 
        }
        return prevWinner; 
     }
}
