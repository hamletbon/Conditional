class Conditional{
    public static void main(String[] args)
    {
        System.out.println(2);
        for (int i = 3; i < 1001; i++)
        {
            if (i%2 == 1) //odd number
            {
                boolean isPrime = true;
                int primeCount = 0;
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
                    System.out.print(i+" ");
                }
                if (primeCount%10 == 0)
                {
                    //count how many number has been printed.
                    System.out.println();
                    primeCount = 0;
                }

            }
        }
    }
}