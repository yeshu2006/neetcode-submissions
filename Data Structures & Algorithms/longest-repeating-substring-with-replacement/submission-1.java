class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int result=0;
        int max_freq=0;
        for(int j=0;j<s.length();j++){
          char c=s.charAt(j);
          map.put(c,map.getOrDefault(c,0)+1);
          max_freq=Math.max(max_freq,map.get(c));
          while((j-i + 1) - max_freq>k){
            map.put(s.charAt(i),map.get(s.charAt(i))-1);
            i++;
          }
          result=Math.max(result,j-i+1);        }
    return result;
    }
}
