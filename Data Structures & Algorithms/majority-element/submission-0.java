class Solution {
    public int majorityElement(int[] nums) {

        int count =0;
        int maxcount=0;
        int majele=nums[0];
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
            else{
             count=0;
            }
            if(count>maxcount){
                maxcount=count;
                majele=nums[i];
            }

        }
        return majele;
    }
}