class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        nums = Arrays.stream(nums).sorted().toArray();
        for (int i = 0; i < nums.length - 2; i++) {
            // Implementation for three sum logic
            int left = i+1;
            int right = nums.length-1;
            while(left < right) {
                if(nums[i] + nums[left] + nums[right] == 0) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    right --;
                }
                else if(nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
