class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int i = 0; i < bills.length; i++) {
            int cur = bills[i];
            if (cur == 5) {
                five++;
            }
            if (cur == 10) {
                five--;
                ten++;
            }
            if (cur == 20) {
                if (ten > 0) {
                    five--;
                    ten--;
                } else {
                    five -= 3;
                }
            }
            if (five < 0 || ten < 0)
                return false;
        }
        return true;
    }
}