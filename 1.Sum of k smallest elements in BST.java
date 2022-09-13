class Tree {
    int s,c;
    int sum(Node root, int k) { 
        s=0;
        c=0;
        dfs(root,k);
        return s;
    } 
    void dfs(Node root,int k){
        if(root==null)
            return;
        dfs(root.left,k);
        if(c<k){
            s+=root.data;
            c++;
        }
        if(c<k){
            dfs(root.right,k);
        }
            
    }
}

Input: 
          20
        /    \
       8     22
     /    \
    4     12
         /    \
        10    14   , K=3

Output: 22
Explanation:
Sum of 3 smallest elements are: 
4 + 8 + 10 = 22
