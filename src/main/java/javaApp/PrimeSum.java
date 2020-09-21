package javaApp;

public class PrimeSum {

    public static void main(String[] args) {
        System.out.println(primesum(20));
    }

    static long primesum(int maxNum) {
        int sum = 0, num;
        //insert your code here
        if(maxNum < 0 || maxNum ==0)
        {
        	return 0;
        }
        for(int i=2;i<=maxNum; i++)
        {
        	boolean bool = isPrime(i);
        	if(bool) {
        		sum = sum +i;
        	}
        }
        return sum;
    }
    
    static boolean isPrime(int num) {
    	int sqrt = (int) Math.sqrt(num)+1;
    	for ( int i= 2; i< sqrt; i++)
    	{
    		if(num % i == 0 )
    		{
    			return false;
    		}
    	}
    	return true;
    }
} 