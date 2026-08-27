class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int result=0;
        int i=0;
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            while(j-i+1>k){
                sum-=arr[i];
                i++;
            }
            if(j-i+1==k && sum >= k * threshold){
                result++;
            }
        }
        return result;
    }
}