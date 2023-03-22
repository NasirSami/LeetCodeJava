public class Valid_Anagram {
    public static void main(String[] args) {
        String[][] strs = { { "anagram", "nagaram" }, { "rat", "car" } };
        boolean[] expected = { true, false };
        for (int i = 0; i < strs.length; i++) {
            System.out.println(isAnagram(strs[i][0], strs[i][1]));
            assert isAnagram(strs[i][0], strs[i][1]) == expected[i];
        }
    }

    public static boolean isAnagram(String s, String t) {
        // If the lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create an array of 26 integers to store the frequency of each letter
        int[] counts = new int[26];

        // Increment the count of each letter in s and decrement the count of each
        // letter
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        // If any of the counts are not zero, the strings are not anagrams
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
