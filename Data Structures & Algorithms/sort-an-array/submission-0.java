class Solution {
    public int[] sortArray(int[] nums) {
    int min = Arrays.stream(nums).min().getAsInt();
    int max = Arrays.stream(nums).max().getAsInt();
    int count[]=new int[max-min+1];
    int result[]=new int[nums.length];
    int c=0;
    for(int num:nums){
        count[num-min]++;
    }
    for(int i=0;i<count.length;i++){
        if(count[i]>0){
            int times=count[i];
            while(times>0){
                result[c++]=i+min;
                times--;
            }
        }
      }
      return result;
    }
}
// 4 1 1 0 0 0 0 0 1 1