class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();

        q.add(s);
        visited.add(s);

        boolean found = false;

        while (!q.isEmpty()) {
            String str = q.poll();

            if (isValid(str)) {
                ans.add(str);
                found = true;
            }

            if (found) {
                continue;
            }

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '(' && str.charAt(i) != ')') {
                    continue;
                }

                String next = str.substring(0, i) + str.substring(i + 1);

                if (!visited.contains(next)) {
                    q.add(next);
                    visited.add(next);
                }
            }
        }

        return ans;
    }

    public boolean isValid(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                count++;
            } 
            else if (ch == ')') {
                count--;

                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }
}