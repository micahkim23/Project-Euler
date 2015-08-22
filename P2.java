public class P2
{
    public static void main(String []args)
    {
        int count = 1;
        int counter = 1;
        int sum;
        int even = 0;
        while (count < 4000000)
        {
          
          
          
          sum = counter + count;
          if (sum%2 == 0) {
              
              even += sum;
            }
          count = counter;
          counter = sum;
          
            
        }
        System.out.println(even);
        
    }
}
