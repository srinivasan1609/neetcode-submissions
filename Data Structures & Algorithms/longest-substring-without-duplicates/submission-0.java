class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right =0;
        int length = 0;
        char[] charSet = s.toCharArray();
        Set<Character> unique = new HashSet<>();

        while(right < charSet.length){

            while(unique.contains(charSet[right])){
                unique.remove(charSet[left]);
                left++;
            }
            unique.add(charSet[right]);
            length = Math.max(length, right-left+1);
            right++;
        }
        return length; 
    }
}
