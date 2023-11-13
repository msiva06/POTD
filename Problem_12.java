// Bus Routes
public class Problem_12 {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        int buses = routes.length;
        Map<Integer,List<Integer>> stopsOfBuses = new HashMap<>();
        for(int i = 0; i < routes.length; i++){
            for(int j = 0; j < routes[i].length; j++){
                int stop = routes[i][j];
                if(!stopsOfBuses.containsKey(stop)){
                    stopsOfBuses.put(stop, new ArrayList<>());
                }
                List<Integer> busesList = stopsOfBuses.get(stop);
                busesList.add(i);
                stopsOfBuses.put(stop,busesList);
            }
        }
        Queue<List<Integer>> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(Arrays.asList(source,0));
        while(!queue.isEmpty()){
            List<Integer> polled = queue.poll();
            int currStop = polled.get(0);
            int currBusCount = polled.get(1);
            if(currStop == target)
                return currBusCount;
            List<Integer> busesList = stopsOfBuses.get(currStop);
            for(Integer bus: busesList){
                if(visited.contains(bus))
                    continue;
                visited.add(bus);
                int[] stopList = routes[bus];
                for(int stops: stopList){
                    queue.offer(Arrays.asList(stops,currBusCount+1));
                }
            }
        }
        return -1;
    }
}
