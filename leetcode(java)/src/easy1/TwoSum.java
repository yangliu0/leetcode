package easy1;

import java.util.HashMap;
import java.util.Map;

/**
 * AC
 */
public class TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        int[] result = new int[2];
        int k;
        int len = nums.length;

        for (int i = 0; i < len; i++)
        {
            for (k = i + 1; k < len; k++)
            {
                if (nums[i] + nums[k] == target)
                {
                    result[0] = i;
                    result[1] = k;
                    return result;
                }
            }
        }
        return null;
    }

    public int[] twoSum1(int[] nums, int target)
    {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] a = {3, 2, 4};
        int target = 6;
        int[] b = new TwoSum().twoSum1(a, target);
        for (int c : b)
        {
            System.out.println(c + " ");
        }
    }
}
