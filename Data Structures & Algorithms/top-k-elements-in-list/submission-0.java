class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num: nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }
        return numMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(k).mapToInt(Map.Entry::getKey).toArray();

    }
}
