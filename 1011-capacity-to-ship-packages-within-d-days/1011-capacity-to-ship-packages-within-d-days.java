class Solution {
    public int shipWithinDays(int[] weights, int days) {

        //high will be sum of all weights
        //low will be max element in array
        int high = 0;
        int low = Integer.MIN_VALUE;
        for (int x : weights) {
            high += x;
            low = Math.max(x, low);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int numberOfDays = findDays(weights, mid);
            if (numberOfDays <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int findDays(int[] arr, int cap) {
        int days = 1, load = 0;
        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] > cap) {
                days++;
                load = arr[i];
            } else {
                load += arr[i];
            }
        }
        return days;
    }
}