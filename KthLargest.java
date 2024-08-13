import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String args[]) {
        System.out.println("KthLargest Element in a Stream is : ");
    }

    private static int k;
    private PriorityQueue<Integer> heap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>();
        for (int element : nums) {
            heap.offer(element);
        }
        while (heap.size() > k) {
            heap.poll();
        }
    }

    public int add(int val) {
        heap.offer(val);
        if (heap.size() > k) {
            heap.poll();
        }
        return heap.peek();
    }
}
