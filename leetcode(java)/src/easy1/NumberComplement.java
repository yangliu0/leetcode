package easy1;

/**
 * 476. Number Complement
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 */

public class NumberComplement
{
    public int findComplement(int num)
    {
        String str = Integer.toBinaryString(num);
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == '1')
            {
                ch[i] = '0';
            }
            else
            {
                ch[i] = '1';
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : ch)
        {
            stringBuilder.append(c);
        }
        String str1 = stringBuilder.toString();

        return Integer.parseInt(str1, 2);
    }

    public int findComplement1(int num)
    {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }

    public static void main(String[] args)
    {
        System.out.println(new NumberComplement().findComplement(5));
        System.out.println(new NumberComplement().findComplement1(5));
    }
}
