class Solution {
    public int firstPosition(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        int answer=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                answer=mid;
                right=mid-1;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return answer;
    }
    public int lastPosition(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        int answer=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                answer=mid;
                left=mid+1;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return answer;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=firstPosition(nums,target);
        int last=lastPosition(nums,target);
        return new int[]{first,last};
    }
}