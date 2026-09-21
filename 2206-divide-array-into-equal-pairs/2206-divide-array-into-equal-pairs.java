import java.util.HashMap;

class Solution {
    public boolean divideArray(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int p : nums) {
            if (map.containsKey(p)) {
                map.put(p, map.get(p) + 1);
            } else {
                map.put(p, 1);
            }
        }

        for (int x : map.values()) {
            if (x % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}