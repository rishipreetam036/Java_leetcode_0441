class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int nextNonZero = 0;
        for (int num : nums) if (num != 0) nums[nextNonZero++] = num;
        while (nextNonZero < nums.length) nums[nextNonZero++] = 0;
    }
}
