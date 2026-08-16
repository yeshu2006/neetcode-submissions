class Solution {
    public int[] sortedSquares(int[] nums) {
        int count=nums.length;
        int [] res=new int[count];
        int i=0;
        int j=count-1;
        int point=nums.length -1;
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                res[point]=nums[i]*nums[i];
                i++;
            }
            else{
                res[point]=nums[j]*nums[j];
                j--;
            }
            point--;
        }
        return res;
    }
}