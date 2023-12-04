package November;
// Seat Reservation Manager
public class Problem_06 {
    PriorityQueue<Integer> pq;
    int marker;
    public SeatManager(int n) {
        pq = new PriorityQueue<Integer>();
        marker = 1;
    }
    
    public int reserve() {
        if(!pq.isEmpty()){
            return pq.poll();
        }
        return marker++;
    }
    
    public void unreserve(int seatNumber) {
        pq.offer(seatNumber);
    }
}
