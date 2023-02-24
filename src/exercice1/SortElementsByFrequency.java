package exercice1;

import java.util.*;

public class SortElementsByFrequency {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 2, 8, 5, 6, 8, 8};
        int[] arr2 = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
        System.out.println(Arrays.toString(sortByFrequency(arr1)));
        System.out.println(Arrays.toString(sortByFrequency(arr2)));
    }
    
    public static int[] sortByFrequency(int[] arr) {
        // Step 1: create a HashMap to store the frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: create a PriorityQueue to sort the elements by frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int freqComp = freqMap.get(b) - freqMap.get(a);
                if (freqComp != 0) {
                    return freqComp;
                } else {
                    return a - b;
                }
            }
        });
        for (int num : freqMap.keySet()) {
            pq.offer(num);
        }
        
        // Step 3: add the elements from the PriorityQueue to a new array
        int[] result = new int[arr.length];
        int i = 0;
        while (!pq.isEmpty()) {
            int num = pq.poll();
            int freq = freqMap.get(num);
            for (int j = 0; j < freq; j++) {
                result[i++] = num;
            }
        }
        
        // Step 4: return the new array
        return result;
    }
}