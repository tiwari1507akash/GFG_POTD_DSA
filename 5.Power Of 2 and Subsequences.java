class Solution{
    static Long numberOfSubsequences(int N, ArrayList<Long> A){
        int c=0;
       long mod=1000000007;
       for(Long i:A){
           if((i&(i-1))==0){
               c++;
           }
       }
       return (long)(Math.pow(2,c)%mod-1)%mod;
    }
}

Input:
N = 3
A[] = {1, 6, 2}
Output:
3
Explanation:
The subsequence that 
can be chosen is {1},
{2} and {1,2}.
