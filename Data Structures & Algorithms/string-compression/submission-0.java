class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;
        int write=0;
        int n=chars.length;
        while(i<n){
            while(j<n&&chars[i]==chars[j]){
                j++;
            }
           chars[write++]=chars[i];
           int count=j - i;
           if (count > 1) {
                String num = String.valueOf(count);

                for (int k = 0; k < num.length(); k++) {
                    chars[write++] = num.charAt(k);
                }
           }
           
           i=j;
        }
        return write;
    }
}