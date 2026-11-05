class Solution {
       public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        String s1 = IntStream.range(0, sArray.length)
                .mapToObj(i -> String.valueOf(sArray[i])).sorted()
                .collect(Collectors.joining());

        String t1 = IntStream.range(0, tArray.length)
                .mapToObj(i -> String.valueOf(tArray[i])).sorted()
                .collect(Collectors.joining());
        return s1.equals(t1);
    }
}
