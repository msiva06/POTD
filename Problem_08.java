// Determine if a cell is reachable at a given time
public class Problem_08 {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int width = Math.abs(sx - fx);
        int height = Math.abs(sy - fy);
        if(width == 0 && height == 0 && t == 1)
            return false;
        return t >= Math.max(width,height);
    }
}
