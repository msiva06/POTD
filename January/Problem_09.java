package January;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Amount of time for binary tree to be infected
public class Problem_09 {
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer,Set<Integer>> map = new HashMap<>();
        convert(root,0,map);
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.add(start);
        int time = 0;
        while(!q.isEmpty()){
           int size = q.size();
           time++;
           for(int i = 0; i < size; i++){
               Integer val = q.poll();
               if(visited.contains(val))
                    continue;
               visited.add(val);
               Set<Integer> adjList = map.get(val);
               for(Integer adj : adjList){
                   if(!visited.contains(adj))
                        q.offer(adj);
               }
           }
        }
        return time-1;
    }

    public void convert(TreeNode root, int parent,Map<Integer,Set<Integer>> map){
        if(root == null)
            return;
        if(!map.containsKey(root.val)){
            map.put(root.val,new HashSet<Integer>());
        }

        Set<Integer> adjList = map.get(root.val);
        if(parent != 0){
            adjList.add(parent);
        }
        if(root.left != null){
            adjList.add(root.left.val);
        }
        if(root.right != null){
            adjList.add(root.right.val);        
        }
        convert(root.left,root.val,map);
        convert(root.right,root.val,map);
    }
}
