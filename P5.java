public class P5
{
    public static void main(String []args)
    {
        int count = 2520;
        int divide = 2;
        int smallestMultiple = 0;
        while (divide < 21)
        {
            int sum = count % divide;
            if (sum == 0)
            {
                divide++;
            }
            else 
            {
                count++;
                divide = 2;
            }
        }    
        smallestMultiple = count;
        System.out.println(smallestMultiple);
    }
}
