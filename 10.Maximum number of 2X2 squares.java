Ques-Given the base (in units) of a right-angled isoceles traingle, find the maximum number of 2X2 squares that can fit in the triangle with given base.
  

class Solution
{
    public static long numberOfSquares(long base)
    {
        long r=0;
        if(base<=3)return 0;
        if(base%2==0){
           r=(base-2)/2; 
        }else{
            r=(base-3)/2;
        }
        long ans=r*(r+1)/2;
        return ans;
    }
}

Input: 8
Output: 6
Explanation:
Please refer below diagram for explanation.
squares-in-triangle

Example 2:

Input : 7
Output : 3
Explanation : In the base we can keep 2 squares
and above the two squares we can only keep 1 square.  
So the total number of squares are equal to 3.
