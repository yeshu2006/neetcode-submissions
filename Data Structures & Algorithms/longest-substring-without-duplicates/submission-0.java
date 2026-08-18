class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int result=0;
        HashSet<Character> set=new HashSet<>();
        while(j<s.length()){
            if(set.contains(s.charAt(j))){
                while(set.contains(s.charAt(j))){
                    set.remove(s.charAt(i++));
                }
            }
                set.add(s.charAt(j));
                result=Math.max(j-i+1,result);
                j++;
        }
        return result;
    }
}
