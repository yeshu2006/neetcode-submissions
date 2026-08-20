class Solution {
    public int maxArea(int[] heights) {
        int maxResult=0;
        int i=0;
        int j=heights.length-1;
        while(i<j){
            int width=j-i;
            int height=Math.min(heights[i],heights[j]);
            int area=height*width;
            maxResult=Math.max(area,maxResult);
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxResult;
    }
}
