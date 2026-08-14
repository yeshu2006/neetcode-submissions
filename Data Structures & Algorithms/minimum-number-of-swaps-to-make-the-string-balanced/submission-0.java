class Solution {
    public int minSwaps(String s) {
        int balance=0;
        int min_balance=0;
        for(char c:s.toCharArray()){
            if(c=='['){
                balance++;
            }
            else{
                balance--;
            }
            min_balance=Math.min(balance,min_balance);
        }
        return (- min_balance+1)/2;
    }
}