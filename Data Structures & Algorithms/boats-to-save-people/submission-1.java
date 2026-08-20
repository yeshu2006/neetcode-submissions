class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // 1 2 2 3 3
        // 1 2 4 5 
        Arrays.sort(people);
        int n= people.length;
        int result=0;
        int i=0;
        int j=n-1;
        while(i<=j){
            int sum=people[i]+people[j];
            if(sum<=limit){
                result++;
                i++;j--;
            }
            else if(people[j]<=limit){
                result++;j--;
            }
            else{
                i++;
            }
        }
        return result;
    }
}