package easy2;

/**
 * 371. Sum of Two Integers
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 */
public class SumofTwoIntegers
{
    public int getSum(int a, int b)
    {
        if (a == 0)
        {
            return b;
        }
        if (b == 0)
        {
            return a;
        }

        while (b != 0)
        {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }

    public static void main(String[] args)
    {
        System.out.println(new SumofTwoIntegers().getSum(1, -2));
    }
}
