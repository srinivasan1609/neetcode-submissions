class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();
        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String newStr = new String(chars);
            strMap.putIfAbsent(newStr, new ArrayList<>());
            strMap.get(newStr).add(str);
        }
        return new ArrayList<>(strMap.values());
    }
}
