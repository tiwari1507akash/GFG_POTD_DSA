// FIND NEXT SMALLER ELEMENT or NSE
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        ArrayList<Integer> al=new ArrayList<>();
        int i,j;
        al.add(-1);
        for(i=1;i<n;i++){
            for(j=i-1;j>=0;j--){
                if(a[i]>a[j]){
                    al.add(a[j]);
                    break;
                }
                if(j==0){
                    al.add(-1);
                    break;
                }
            }
        }
        return al;
    }
}

Input: n = 6
a = {1, 5, 0, 3, 4, 5}
Output: -1 1 -1 0 3 4
Explaination: Upto 3 it is easy to see 
the smaller numbers. But for 4 the smaller 
numbers are 1, 0 and 3. But among them 3 
is closest. Similary for 5 it is 4.
