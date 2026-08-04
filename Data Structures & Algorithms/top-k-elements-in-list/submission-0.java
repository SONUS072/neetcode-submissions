class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int num : nums){
            set.put(num,set.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
        (a,b) -> set.get(b) - set.get(a));
        pq.addAll(set.keySet());
        
        int[] ans = new int[k];
        for(int i = 0; i<k; i++){
            ans[i] = pq.poll();
        }
           return ans;
        }
}
