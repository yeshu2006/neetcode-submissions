class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int a1=0;
        int a2=Integer.MAX_VALUE;
        for (int value : map.values()) {
            if(value%2==0){
                a2=Math.min(value,a2);
            }
            else{
                a1=Math.max(value,a1);
            }
        }
       return a1-a2;
    }
}