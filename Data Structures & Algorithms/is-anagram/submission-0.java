class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; //invariant; returns false if strings are not of equal length
        
        
        //the anagram must: 1. have the same letters 2. have the same number of letters 3. have the same length
        //algo 1: sort strings, then compare each letter. O(n log n)

        //create char arrays for both strings to sort them
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        //sort both sArr and tArr
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(tArr, sArr);
        

        //algo 2: put both 
        
    }
}
