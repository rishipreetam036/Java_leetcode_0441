class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maximum = 0;
        for (int[] customer : accounts) {
            int wealth = 0;
            for (int money : customer) wealth += money;
            maximum = Math.max(maximum, wealth);
        }
        return maximum;
    }
}
