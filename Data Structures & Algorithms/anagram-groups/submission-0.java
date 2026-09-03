/*notes
    line "6": if ansList is not empty and s and the first string from each arraylist in anslist are an anagram (isAnagram return true)
                add s to the arraylist inside of anslist
            else
                add a new arraylist to ansList and add s to that list
*/
//new solution: put all the values inside the anslist array inside an arraylist, so it will
//look like [["a", "b", "c", etc]]
//then we test if the first item is an anagram of the second. if not, remove it and put it in its own
//array. 

//ok so after creating a list list holder, creating a temp var for each string
//creating a temp list for each list, we test in any lists exist. if not, just put it in.we test the first element of each list

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ansList = new ArrayList<>();
        for (String s :  strs) {
            if (ansList.isEmpty()) {
                ansList.add(new ArrayList<String>(List.of(s)));
            }
            else {
                boolean catched = true;
                for (int i = 0; i < ansList.size(); i++) {
                    if (isAnagram(ansList.get(i).get(0), s)) {
                        ansList.get(i).add(s);
                        catched = false;
                    }
                }
                if (catched) {
                    ansList.add(new ArrayList<String>(List.of(s)));
                }
            }
        }
        return ansList;        
    }
        
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