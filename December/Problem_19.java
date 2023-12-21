package December;

import java.util.LinkedList;
import java.util.Queue;

// Image smoother
public class Problem_19 {
    public int[][] imageSmoother(int[][] img) {
        Queue<int[]> queue = new LinkedList<>();
        int n = img.length;
        int m = img[0].length;
        int[][] res = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                queue.offer(new int[]{i,j});
            }
        }
        while(!queue.isEmpty()){
            int[] popped = queue.poll();
            int x = popped[0];
            int y = popped[1];
            int[][] offset = {{0,1},{1,0},{-1,0},{0,-1},{1,1},{-1,1},{1,-1},{-1,-1}};
            int sum = img[x][y];
            int count = 1;
            int avg = 0;
            for(int[] off : offset){
                int nx = x + off[0];
                int ny = y + off[1];
                if(nx >= 0 && ny >=0 && nx < n && ny < m){
                    sum += img[nx][ny];
                    count++;
                }
            }
            avg = sum / count;
            res[x][y] = avg;
        }
        return res;
    }
}
