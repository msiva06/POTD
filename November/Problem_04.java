package November;
// Last moment before all ants fall out of a plank
public class Problem_04 {
    public int getLastMoment(int n, int[] left, int[] right) {
        int time = 0;
        for(int num : left){
            time = Math.max(num,time);
        }
        for(int num : right){
            time = Math.max(n - num, time);
        }
        return time;
    }
}
