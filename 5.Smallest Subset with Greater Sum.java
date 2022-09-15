class Solution { 
    int minSubset(int[] arr,int N) { 
        Arrays.sort(arr);
        long sum=0;
        for(int i:arr){
            sum+=i;
        }
        long cur=0;
        int i=arr.length-1;
        while(cur<=sum){
            cur+=arr[i];
            sum-=arr[i];
            i--;
        }
        return arr.length-1-i;
    }
}

Input:
N = 4
Arr = {20, 12, 18, 4}
Output:
2
Explanation:
If we select 12 and 18 from the array,
the sum will be (12+18) = 30 and the sum of
the rest of the elements will be (20+4) = 24.
So, the answer will be 2. We can also
select 20 and 18 as well.
