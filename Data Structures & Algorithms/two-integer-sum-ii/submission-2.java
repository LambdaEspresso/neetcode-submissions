class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int i = 0;
        int j = 1;
        int index1 = numbers[i];
        int index2 = numbers[j];
        int sum;
        boolean moveIndex1 = false;
        while (j < len - 1) {
            sum = index1 + index2;
            if (sum != target) {
                if (j < len - 1) {
                    j++;
                    index2 = numbers[j];
                }
            } else return new int[]{i+1, j+1};
        }
        while (i < j) {
            index1 = numbers[i];
            index2 = numbers[j];
            sum = index1 + index2;
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else return new int[]{i+1, j+1};
        }
        return new int[]{-1, -1};
    }
}
