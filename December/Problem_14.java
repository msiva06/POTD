package December;

// Difference between ones and zeroes in row and column
public class Problem_14 {
    public int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] diff = new int[rows][cols];
        int zeroRow[] = new int[rows];
        int zeroCol[] = new int[cols];
        int oneRow[] = new int[rows];
        int oneCol[] = new int[cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 0)
                    zeroRow[i]+= 1;
                else
                    oneRow[i]+=1;
            }
        }
        for(int j = 0; j < cols; j++){
            for(int i = 0; i < rows; i++){
                if(grid[i][j] == 0)
                    zeroCol[j] += 1;
                else
                    oneCol[j] += 1;
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                diff[i][j] = oneRow[i] + oneCol[j] - zeroRow[i] - zeroCol[j];
            }
        }
        return diff;
     }
}
