public class P4
{
    public static void main(String []args)
    {
        int int1 = 100;
        int int2 = 100;
        int bigPalindrome = 0;
        while (int1 < 1000)
        {
            while (int2 < 1000)
            {
                int product = int1 * int2;
                if (product < 100000)
                {
                    int a = product/10000;
                    int b = product/1000 % 10;
                    int c = product/100 % 10;
                    int d = product/10 %10;
                    int e = product % 10; 
                    if (a == e & b == d)
                    {
                        if (bigPalindrome < product) {
                            bigPalindrome = product;
                        }
                    }
                }
                if (product < 1000000)
                {
                    int a = product/100000;
                    int b = product/10000 % 10;
                    int c = product/1000 % 10;
                    int d = product/100 % 10;
                    int e = product/10 % 10;
                    int f = product % 10;
                    if (a == f & b == e & c == d)
                    {
                        if (bigPalindrome < product) {
                            bigPalindrome = product;
                        }
                    }    

                }
                int2++;
            }
            int2 = 100;
            int1++;
        }
        System.out.println(bigPalindrome);
    }
}
