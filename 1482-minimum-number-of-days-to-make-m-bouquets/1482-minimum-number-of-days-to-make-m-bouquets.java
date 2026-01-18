class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        if ((long) m * k > n)
            return -1;

        int high = 0, low = Integer.MAX_VALUE;
        for (int a : bloomDay) {
            low = Math.min(low, a);
            high = Math.max(high, a);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (possible(bloomDay, mid, m, k)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean possible(int[] arr, int day, int m, int k) {

        int count = 0, no_of_bouquets = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count++;
                if (count == k) {
                    no_of_bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return no_of_bouquets >= m;

    }
}