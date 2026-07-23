class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        int j = 1;
        int k;
        int len = nums.length;
        int num;
        while (i < len) {
            j = 0;
            k = len - 1;
            while (j < k) {
                if (j == i) j++;
                if (k == i) k--;
                if (j >= k) break;
                if (nums[j] + nums[k] == -nums[i]) {
                    List<Integer> tempList = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                    tempList.sort(null);
                    if (!list.contains(tempList)) {
                        list.add(tempList);
                    } else {
                        j++;
                        k--;
                    }
                } else if (nums[j] + nums[k] < -nums[i]) j++;
                else k--;
            }
            i++;
            num = nums[i - 1];
            while (i < len && nums[i] == num) i++;
        }
        return list;
    }
}
