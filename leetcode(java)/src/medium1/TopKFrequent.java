package medium1;

import java.util.*;

/**
 * 347. Top K Frequent Elements
 * Given a non-empty array of integers, return the k most frequent elements.
 */
public class TopKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> (a.getValue() - b.getValue()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.offer(entry);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        List<Integer> result = new LinkedList<>();
        while (!maxHeap.isEmpty()) {
            result.add(0, maxHeap.poll().getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 2, 3};
        System.out.println(new TopKFrequent().topKFrequent(a, 2));
    }
}
