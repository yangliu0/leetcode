package easy2;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 */
public class FindAllNumbersDisappearedinanArray
{
    public List<Integer> findDisappearedNumbers(int[] nums)
    {
         List<Integer> list = new ArrayList<Integer>();

        int index;
        for(int i = 0; i < nums.length; i++)
        {
            index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0)
            {
                nums[index] = -nums[index];
            }
        }

        for(int j = 0; j < nums.length; j++)
        {
            if(nums[j] > 0)
            {
                list.add(j + 1);
            }
        }

        return list;
    }

    public static void main(String[] args)
    {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(new FindAllNumbersDisappearedinanArray().findDisappearedNumbers(nums));
    }
}
