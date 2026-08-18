class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> table =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(table.containsKey(nums[i])){
                int j=table.get(nums[i]);
                if(Math.abs(i-j)<=k){
                    return true;
                }
            }
            table.put(nums[i],i);
        }
        return false;
    }
}