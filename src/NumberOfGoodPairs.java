class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int[] frequency = new int[101];
        int pairs = 0;
        for (int num : nums) { pairs += frequency[num]; frequency[num]++; }
        return pairs;
    }
}
