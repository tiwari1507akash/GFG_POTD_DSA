Ques-There are given N ropes of different lengths, we need to connect these ropes into one rope. 
The cost to connect two ropes is equal to sum of their lengths.The task is to connect the ropes with minimum cost.
Given N size array arr[] contains the lengths of the ropes. 

class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(long i:arr){
            pq.add(i);
        }
        
        long ans=0;
        while(pq.size()>1){
            long a=pq.poll();
            long b=pq.poll();
            long sum=(a+b);
            ans+=sum;
            pq.add(sum);
        }
        return ans;
    }
}

Input: 
5
4 2 6 7 9
Your Output: 
2 4
6 6
7 9
12 16
62
Expected Output: 
62
