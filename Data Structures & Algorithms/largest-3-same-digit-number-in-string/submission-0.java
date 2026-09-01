class Solution {
    public String largestGoodInteger(String num) {
        int curr_ele=0;
        String result="";
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+2)&&num.charAt(i)==num.charAt(i+1)){
             String current=num.substring(i,i+3);
             if(result==""|| current.compareTo(result)>0){
                result=current;
             }
            }
        }
        return result;
    }
}