import java.util.Set;
import java.util.HashSet;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3, 1 }, { 1, 2, 3, 4 }, { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 } };
        boolean[] expected = { true, false, true };
        for (int i = 0; i < nums.length; i++) {
            System.out.println(hasDuplicates(nums[i]));
            assert hasDuplicates(nums[0]) == expected[i];
        }

    }

    public static boolean hasDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
