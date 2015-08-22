public class P1
{
    public static void main(String []args)
    {
        int number = 0;
        int counter = 1;

        while (counter < 1000) {
            if (counter%3 == 0 || counter%5 == 0) 
            {
                number += counter;

            }
            counter ++;
        }

        System.out.println(number);
    }
}
