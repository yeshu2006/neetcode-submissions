class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        int n1=word1.length();
        int n2=word2.length();
        int c=0;
        char []arr=new char[n1+n2];
        while(i<n1||j<n2){
            if(j==n2){
            arr[c++]=word1.charAt(i++);  
            }
            else if(i==n1){
               arr[c++]=word2.charAt(j++);
            }
            else{
            arr[c++]=word1.charAt(i++);
            arr[c++]=word2.charAt(j++);
            }
        }
        return new String(arr);
    }
}