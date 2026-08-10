class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

     //frequency count 
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

      //MAx Frque/....... Using Priority queue 
      PriorityQueue<Integer> pq=new PriorityQueue<>(
        (a,b)->map.get(b)-map.get(a)
      );
       pq.addAll(map.keySet());

      //k frequent elements 
       int [] result=new int[k];
       for(int i=0;i<k;i++){
       result[i]=pq.poll();
    }
    return result;
}
}
