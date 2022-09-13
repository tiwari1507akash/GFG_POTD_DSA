class Solution
{
    public static void convertToMaxHeapUtil(Node root)
    {
        List<Integer> ls=new ArrayList<>();
        InOrder(ls,root);
        // int ind=0;      
        //Java doesn't support pass by refrence so for this we use dynamic array which take same 4 byte as a variable
        postOrderConvert(ls,root,new int[]{0});
    }
    
    static void InOrder(List<Integer> ls,Node root){
        if(root==null)
            return;
        InOrder(ls,root.left);
        ls.add(root.data);
        InOrder(ls,root.right);
    }
    
    static void postOrderConvert(List<Integer> ls,Node root,int[] i){
         if(root==null)
            return;
        postOrderConvert(ls,root.left,i);
        postOrderConvert(ls,root.right,i);
        root.data=ls.get(i[0]);
        i[0]++;
     }
}


Input :
                 4
               /   \
              2     6
            /  \   /  \
           1   3  5    7  

Output : 1 2 3 4 5 6 7 
Exaplanation :
               7
             /   \
            3     6
          /   \  /   \
         1    2 4     5
The given BST has been transformed into a
Max Heap and it's postorder traversal is
1 2 3 4 5 6 7.
Footer
