package January;

// Number of laser beams in a bank
public class Problem_03 {
    public int numberOfBeams(String[] bank) {
        int rows = bank.length;
        int[] secDevices = new int[rows];
        int idx = 0;
        for(String b : bank){
            char[] bChar = b.toCharArray();
            for(int i = 0; i < bChar.length; i++){
                if(bChar[i] == '1'){
                    secDevices[idx] += 1;
                }
            }
            idx++;
        }
        int noOfBeams = 0;
        int currRow = rows-1;
        int prevRow = rows-2;
        while(prevRow >= 0){
            while(prevRow > 0 && secDevices[prevRow] == 0){
                prevRow--;
            }
            noOfBeams += secDevices[currRow] * secDevices[prevRow];
            currRow = prevRow;
            prevRow--;
        }
        return noOfBeams;
    }
}
