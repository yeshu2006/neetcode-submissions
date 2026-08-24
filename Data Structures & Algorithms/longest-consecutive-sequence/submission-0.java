class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i]-1;
            if(set.contains(num)){
                continue;
            }
            int longest=1;
            while(set.contains(nums[i]+longest)){
                longest++;
            }
            res=Math.max(longest,res);
        }
return res;
    }
}
