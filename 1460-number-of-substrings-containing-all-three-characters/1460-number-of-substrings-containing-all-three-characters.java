class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int left=0;
        int[] carcount=new int[3];

        for(int right=0;right<s.length();right++){
            carcount[s.charAt(right)-'a']++;
            while(carcount[0]>0 && carcount[1]>0 && carcount[2]>0){
                count+=s.length()-right;
                carcount[s.charAt(left)-'a']--;
                left++;
            }
        }
        return count;
    }
}