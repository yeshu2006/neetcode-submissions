class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whites=0;
        int j=0;
        int result=Integer.MAX_VALUE;
        for(int i=0;i<blocks.length();i++){
            if(blocks.charAt(i)=='W'){
                whites++;
            }
            while((i-j+1)>k){
                if(blocks.charAt(j)=='W'){
                    whites--;
                }
                j++;
            }
            if(i-j+1==k){
                 result = Math.min(result, whites);
            }
        }
            return result;
        } 
        
    }
