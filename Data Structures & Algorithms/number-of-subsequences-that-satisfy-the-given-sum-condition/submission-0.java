public class Solution {
    public int numSubseq(int[] nums, int target) {
        int MOD = 1_000_000_007;
        int n = nums.length;
        
        // 1. Sort the array
        Arrays.sort(nums);
        
        // 2. Precompute powers of 2 modulo 10^9 + 7
        int[] pow2 = new int[n];
        pow2[0] = 1;
        for (int i = 1; i < n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }
        
        // 3. Two-pointer approach
        int left = 0, right = n - 1;
        int ans = 0;
        
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                // Add the number of valid subsequences
                ans = (ans + pow2[right - left]) % MOD;
                left++;
            } else {
                right--;
            }
        }
        
        return ans;
    }
}
