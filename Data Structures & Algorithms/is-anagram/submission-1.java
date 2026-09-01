class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) { return false; }
        int[] letFreq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letFreq[s.charAt(i) - 'a']++;
            letFreq[t.charAt(i) - 'a']--;
        }

        for (int val : letFreq) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}
