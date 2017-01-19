package easy1;

/**
 * 258. Add Digits
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 */
public class AddDigits
{
    public int addDigits(int num)
    {
        int result = 0;
        String str = String.valueOf(num);
        while (str.length() >= 1)
        {
            num = 0;
            for(int i = 0; i < str.length(); i++)
            {
                num += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            if(num < 10)
            {
                result = num;
                break;
            }
            str = String.valueOf(num);
        }
        return result;
    }

    public int addDigits1(int num)
    {
        return num == 0 ? 0 : ((num % 9) == 0 ? 9 : (num % 9));
    }

    public static void main(String[] args)
    {
        System.out.println(new AddDigits().addDigits1(88));
    }
}
