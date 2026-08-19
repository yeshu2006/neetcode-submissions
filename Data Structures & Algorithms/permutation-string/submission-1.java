class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        HashMap<Character,Integer> check=new HashMap<>();
        for(char c :s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int j=0;j<s2.length();j++){
            char c=s2.charAt(j);
            if(!map.containsKey(c)){
                check.clear();
                i=j+1;
                continue;
            }
            check.put(c,check.getOrDefault(c,0)+1);
            if(j-i+1 == s1.length()){
                if(check.equals(map)){
                    return true;
                }
                check.put(s2.charAt(i),check.get(s2.charAt(i))-1);
                if(check.get(s2.charAt(i))==0){
                    check.remove(s2.charAt(i));
                }
                i++;
            }
        }
        return false;
    }
}
