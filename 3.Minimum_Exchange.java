class Solution
{
    public int MinimumExchange(char[][] matrix)
    {
        int r=matrix.length,c=matrix[0].length;
        int seq1=0,seq2=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]=='A'){
                    if((i+j)%2==1){
                        seq1++;
                    }else{
                        seq2++;
                    }
                }else{
                    if((i+j)%2==1){
                        seq2++;
                    }else{
                        seq1++;
                    }
                }
            }
        }
        int result=Math.min(seq1,seq2);
        if (result%2==0)
           return result/2;
        else
           return Math.min(result,(r*c-result)/2);
    }
}

Input: matrix = {{A,A,B,A},{B,A,B,A},{B,B,A,B}}
Output: 2
Explanation: Minimum number of students whose 
sets got changed are 4 (indexes: ((0,1),(0,2),
(0,3),(2,0))). The final alloted sets are:
A B A B
B A B A
A B A B
Here 2 exchange are done so answer is 2.

        or
B A B A
A B A B
B A B A
Here 8 exchange.
