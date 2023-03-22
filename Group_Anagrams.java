import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[][] strs = { { "eat", "tea", "tan", "ate", "nat", "bat" },
                { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                        "u",
                        "v", "w", "x", "y", "z" },
                { "a" } };
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("ate", "eat", "tea"),
                Arrays.asList("nat", "tan"),
                Arrays.asList("bat"));
        for (int i = 0; i < strs.length; i++) {
            System.out.println(groupAnagrams(strs[i]));
            assert groupAnagrams(strs[i]).equals(expected.get(i));
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        // create a map to store the groups of anagrams
        Map<String, List<String>> map = new HashMap<>();
        // loop through each string in the array
        for (String s : strs) {
            // sort the characters of the string alphabetically
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            // if the sorted string is already a key in the map, add the original string to
            // its value list
            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                // otherwise, create a new list with the original string and put it in the map
                // with the sorted string as key
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            }
        }
        // return a list of all the values in the map
        return new ArrayList<>(map.values());
    }
}
