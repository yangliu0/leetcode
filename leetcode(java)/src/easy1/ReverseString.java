package easy1;

/**
 * Created by liuyang on 2016/9/27.
 */

public class ReverseString
{
    public String reverseString(String s)
    {
        StringBuilder A=new StringBuilder(s);
        StringBuilder B = A.reverse();
        return B.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(new ReverseString().reverseString("abcd"));
    }
}
