
import java.util.*;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;
        long[] diff = new long[n];

        long max = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs((long) nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
            sum += diff[i];
        }

        if (k >= sum) {
            return 0;
        }

        long low = 0, high = max;

        while (low < high) {
            long mid = low + (high - low) / 2;
            long operations = 0;

            for (long d : diff) {
                if (d > mid) {
                    operations += d - mid;
                }
            }

            if (operations <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        long limit = low;
        long remaining = k;
        long answer = 0;

        for (long d : diff) {
            if (d > limit) {
                remaining -= d - limit;
                d = limit;
            }
            answer += d * d;
        }

        for (long d : diff) {
            if (remaining == 0) break;

            if (d >= limit && d > 0) {
                answer -= limit * limit - (limit - 1) * (limit - 1);
                remaining--;
            }
        }

        return answer;
    }
}
