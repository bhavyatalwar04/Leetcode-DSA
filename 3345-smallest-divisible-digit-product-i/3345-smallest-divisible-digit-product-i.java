class Solution {
    public int smallestNumber(int n, int t) {
        int no=0;
        for (int i = n; i <= 100; i++) {
            no=i;
            int prod = calProd(i);
            if (prod % t == 0)
                break;
        }
        return no;
    }

    public int calProd(int num) {
        int ans = 1;
        while (num > 0) {
            int n = num % 10;
            ans *= n;
            num /= 10;
        }
        return ans;
    }
}