class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> st=new Stack<>();
        st.push(arr[n-1]);
        long[] ans=new long[n];
        ans[n-1]=-1;
        for(int i=n-2; i>=0; i--)
        {
            while(!st.isEmpty() && arr[i]>=st.peek() )
            {
                st.pop();
            }
            if(st.size()==0)
            {
                ans[i]=-1;
            }
            else
            {
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    } 
}

Input: 
N = 4, arr[] = [1 3 2 4]
Output:
3 4 4 -1
Explanation:
In the array, the next larger element 
to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ? 
since it doesn't exist, it is -1.
