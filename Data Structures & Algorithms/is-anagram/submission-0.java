class Solution {
    public boolean isAnagram(String s, String t) {
     if (s.length() !=t.length()) return false;
      int[] count = new int[26];                    // Step 4
        for (int i = 0; i < s.length(); i++) {        // Step 5
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {                          // Step 6
            if (c != 0) return false;
        }
        return true;
    }
}
