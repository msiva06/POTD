package February;

import java.util.Arrays;
import java.util.PriorityQueue;

// Meeting Rooms III
public class Problem_20 {
     public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings,(a,b)-> a[0]-b[0]);
        PriorityQueue<int[]> usedRooms = new PriorityQueue<int[]>((a,b)->
        a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        PriorityQueue<Integer> unusedRooms = new PriorityQueue<Integer>((a,b) -> 
        a - b);

        int[] meetCount = new int[n];

        for(int i =0; i < n; i++){
            unusedRooms.offer(i);
        }

        for(int i = 0; i < meetings.length; i++){
            int start = meetings[i][0], end = meetings[i][1];
            while(!usedRooms.isEmpty() && usedRooms.peek()[0] <= start){
                int room = usedRooms.poll()[1];
                unusedRooms.offer(room);
            }
            if(!unusedRooms.isEmpty()){
                int room = unusedRooms.poll();
                meetCount[room]++;
                usedRooms.offer(new int[]{end,room});
            }
            else{
                int availabilitytime = usedRooms.peek()[0];
                int newAvailability = availabilitytime + end - start;
                int room = usedRooms.poll()[1];
                meetCount[room]++;
                usedRooms.offer(new int[]{newAvailability,room});
            }

        }

        int maxMeetings = 0, maxRoom = 0;
        for(int i = 0; i < n; i++){
            if(meetCount[i] > maxMeetings){
                maxMeetings = meetCount[i];
                maxRoom = i;
            }
        }
        return maxRoom;
    }
}
