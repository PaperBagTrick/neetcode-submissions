class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ansMap = new HashMap<>();
        for (String s : strs) {
            char[] stochararr = s.toCharArray();
            Arrays.sort(stochararr);
            String sortedS = new String(stochararr);
            if (ansMap.containsKey(sortedS)) {
                ansMap.get(sortedS).add(s);
            }
            else {
                ansMap.put(sortedS, new ArrayList<String>(List.of(s)));
            }
        }
        return new ArrayList<>(ansMap.values());
    }
}
