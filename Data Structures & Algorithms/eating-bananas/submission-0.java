class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max_pile = Arrays.stream(piles).max().getAsInt();

        int left = 1;
        int right = max_pile;
        int ans = max_pile;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            long hours = 0;

            for (int x : piles) {
                hours += (x + mid - 1) / mid;
            }

            if (hours <= h) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}