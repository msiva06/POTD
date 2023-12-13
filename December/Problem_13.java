package December;

// Special positions in binary matrix
public class Problem_13 {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] rowcount = new int[n];
        int[] colcount = new int[m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                rowcount[i] += mat[i][j];
            }
        }

        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                colcount[j] += mat[i][j];
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 1){
                    if(rowcount[i] == 1 && colcount[j] ==1)
                        count++;  
                }
            }
        }
        return count;
    }
}
