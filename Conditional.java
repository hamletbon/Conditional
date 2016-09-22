class Conditional{
    public static void main(String[] args)
    {
        System.out.print(2+", ");
        for (int i = 1; i < 11; i++)
        {
            //if (i%2 != 0)
            if (i%2 == 1) //odd number
            {
                boolean isPrime = true;
                for (int k = i-1 ; k>= 2 ; k = k - 1)
                {
                    if (i % k == 0)
                    {
                        isPrime = false;
                        //i is NOT a prime number
                    }
                }
                if (isPrime == true)
                {
                    //is a prime number!
                    System.out.println(i);
                }
            }
        }
    }
}