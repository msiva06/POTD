package February;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Pair{
    int meetingTime;
    int person;
    public Pair(int meetingTime,int person){
        this.meetingTime = meetingTime;
        this.person = person;
    }
}

// Find all people with secret
public class Problem_24 {
   public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        List<Pair>[] adjList = new ArrayList[n];
        for(int i = 0; i < n; i++){
            adjList[i] = new ArrayList<>();
        }

        for(int i = 0; i < meetings.length; i++){
            int stPerson = meetings[i][0];
            int endPerson = meetings[i][1];
            int time = meetings[i][2];
            adjList[stPerson].add(new Pair(time,endPerson));
            adjList[endPerson].add(new Pair(time,stPerson));
        }

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        q.offer(new int[]{firstPerson,0});

        int[] earliest = new int[n];
        Arrays.fill(earliest,Integer.MAX_VALUE);
        earliest[0] = 0;
        earliest[firstPerson] = 0;

        while(!q.isEmpty()){
            int[] p = q.poll();
            int meettime = p[1];
            int person = p[0];
            List<Pair> adj = adjList[person];
            for(Pair a : adj){
                if(a.meetingTime >= meettime && earliest[a.person] > a.meetingTime){
                    earliest[a.person] = a.meetingTime;
                    q.offer(new int[]{a.person,a.meetingTime});
                }
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < earliest.length; i++){
            if(earliest[i] != Integer.MAX_VALUE){
                res.add(i);
            }
        }

        return res;
    }
}
