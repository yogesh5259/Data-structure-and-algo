/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scan.nextLong();
            System.out.println(power(2, n - 1, 1000000007));
        }
	}
static long power(long x, long y, long p)
  {
    long res = 1; // Initialize result
 
    x = x % p; // Update x if it is more than or
    // equal to p
 
    if (x == 0)
      return 0; // In case x is divisible by p;
 
    while (y > 0)
    {
 
      // If y is odd, multiply x with result
      if ((y & 1) != 0)
        res = (res * x) % p;
 
      // y must be even now
      y = y >> 1; // y = y/2
      x = (x * x) % p;
    }
    return res;
  }
}
