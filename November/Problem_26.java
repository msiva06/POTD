package November;
import java.util.Arrays;

// Largest submatrix with rearrangements
public class Problem_26 {
    public int largestSubmatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] prevRow = new int[cols];
        int ans = 0;
        for(int row = 0; row < rows; row++){
            int[] curRow = new int[cols];
            for(int col = 0; col < cols; col++){
                if(matrix[row][col] == 1){
                    curRow[col] = prevRow[col]+1;
                }
            }
                int[] sortedRow = curRow.clone();
                Arrays.sort(sortedRow);
                for(int k = 0; k < cols; k++){
                    ans = Math.max(ans,sortedRow[k] * (cols-k));
                }
            prevRow = curRow;
        }
        return ans;
    }
}
