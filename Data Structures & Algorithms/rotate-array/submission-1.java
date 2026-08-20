class Solution {
    public void reverse(int i,int j, int[] arr) {
        int start = i;
        int end = j-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(0,nums.length,nums);
        reverse(0,k,nums);
        reverse(k,nums.length,nums);

    }
}