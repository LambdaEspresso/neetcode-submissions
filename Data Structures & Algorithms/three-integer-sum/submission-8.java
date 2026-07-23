class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        int j = 1;
        int k;
        int len = nums.length;
        int sum;
        while (i < len - 2) {
            j = i + 1;
            k = len - 1;
            while (j < k) {
                sum = nums[j] + nums[k] + nums[i];
                if (sum == 0) {
                    list.add(new ArrayList<>(List.of(nums[i], nums[j], nums[k])));
                    j++;
                    while (j < len && nums[j] == nums[j - 1]) j++;
                    k--;
                    while (k >= 0 && nums[k] == nums[k + 1]) k--;
                } else if (sum < 0) j++;
                else k--;
            }
            i++;
            while (i < len && nums[i] == nums[i - 1]) i++;
        }
        return list;
    }
}
