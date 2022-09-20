class Solution
{
    public int Count(int L, int R)
    {
        // sieve of eratosthenes java take O(nlogn) time complexity
        boolean isPrime[] = new boolean[R+1];
        
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        
        for(int i=2;i<=R;i++){
            if(isPrime[i]==true){
                for(int j=i*2;j<=R;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        
        int prime_count=0;
        int com_count=0;
        
        for(int i=L;i<=R;i++){
            if(isPrime[i]){
                prime_count++;
            }
            else{
                com_count++;
            }
        }
        if(L==1){
            com_count--;
        }
        return (com_count-prime_count);
    }
}

Example 1:

Input: L = 4, R = 6
Output: 1
Explanation: Composite no. are 4 and 6.
And prime is 5.

Example 2:

Input: L = 4, R = 4
Output: 1
Explanation: There is no prime no. in [L,R]
