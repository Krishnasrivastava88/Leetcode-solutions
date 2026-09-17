import java.util.*;

class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;
        int[] best = new int[n];

        Arrays.fill(best, n + 1);

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int prefixSum = 0;
        int ans = n + 1;

        for (int i = 0; i < n; i++) {

            prefixSum += arr[i];

            if (i > 0) {
                best[i] = best[i - 1];
            }

            if (map.containsKey(prefixSum - target)) {

                int j = map.get(prefixSum - target);

                int length = i - j;

                if (j >= 0 && best[j] != n + 1) {
                    ans = Math.min(ans, length + best[j]);
                }

                best[i] = Math.min(best[i], length);
            }

            map.put(prefixSum, i);
        }

        if (ans == n + 1) {
            return -1;
        }

        return ans;
    }
}