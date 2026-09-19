class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n= s.length();
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            char c= s.charAt(i);
            if( map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
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