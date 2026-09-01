class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> ansMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (ansMap.containsKey(dif)) {
                return new int[] {ansMap.get(dif), i};
            }
            else
            {
                ansMap.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("it doesnt exist");
    }
}
