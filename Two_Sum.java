import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[][][] nums = { { { 2, 7, 11, 15 }, { 9 } }, { { 3, 2, 4 }, { 6 } }, { { 3, 3 }, { 6 } } };
        int[][] expected = { { 0, 1 }, { 1, 2 }, { 0, 1 } };
        for (int i = 0; i < nums.length; i++) {
            int[] result = twoSum(nums[i][0], nums[i][1][0]);
            System.out.println(result[0] + ", " + result[1]);
            assert result[0] == expected[i][0] && result[1] == expected[i][1];
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        // create a map to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        // loop through the array
        for (int i = 0; i < nums.length; i++) {
            // get the current number
            int num = nums[i];
            // calculate its complement
            int complement = target - num;
            // check if the complement exists in the map
            if (map.containsKey(complement)) {
                // return the indices of both numbers
                return new int[] { map.get(complement), i };
            }
            // otherwise, put the number and its index in the map
            map.put(num, i);
        }
        // if no pair is found, return an empty array
        return new int[0];

    }
}
