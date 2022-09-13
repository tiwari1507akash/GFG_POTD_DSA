class Solution
{
    public int findOccurrence(char mat[][], String target)
    {
        int res=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                res+=found(mat,i,j,target,0);
            }
        }
        return res;
    }
    
    public int found(char mat[][],int i,int j,String target,int idx){
        int f=0;
        if(i>=0 && i<mat.length && j>=0 && j<mat[0].length && target.charAt(idx)==mat[i][j]){
            mat[i][j]='*';
            if(idx==target.length()-1){
                f=1;
            }else{
                f+=found(mat,i,j-1,target,idx+1);
                f+=found(mat,i+1,j,target,idx+1);
                f+=found(mat,i-1,j,target,idx+1);
                f+=found(mat,i,j+1,target,idx+1);
            }
            mat[i][j]=target.charAt(idx);
        }
        return f;
    }
}


Input: 
R = 4, C = 5
mat = {{S,N,B,S,N},
       {B,A,K,E,A},
       {B,K,B,B,K},
       {S,E,B,S,E}}
target = SNAKES
Output:
3
Explanation: 
S N B S N
B A K E A
B K B B K
S E B S E
Total occurrence of the word is 3
and denoted by color.
S N
  A
  K
  E
2 TIMES OCCUR
S N
  A K E
1 TIMES OCCUR
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
