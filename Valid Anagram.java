class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char c;
        HashMap<Character,Integer> word = new HashMap<Character,Integer>();
        for (int i = 0; i<s.length(); i++){
            c = s.charAt(i);
            word.put(c, word.getOrDefault(c, 0) + 1);
            c = t.charAt(i);
            word.put(c, word.getOrDefault(c, 0) - 1);
        }

        for (int count : word.values()){
            if (count != 0){
                return false;
            }
        }
        return true;
    }
}
