public class P3
{
    public static void main(String[] args)
    {
        int count = 2;
        int largestPrimeFactor = 0;
        long num = 600851475143L;
        while (count < num)
        {
            long num2 = num % count;
            if (num2 == 0)
            {
                num = num / count;
               
            }
            else if (num2 != 0)
            {
                count++;
            }
            
            
        }
        System.out.println(num);
    }
}