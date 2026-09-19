class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = map.get(s.charAt(0));

        for (int value : map.values()) {
            if (value != count) {
                return false;
            }
        }

        return true;
    }
}