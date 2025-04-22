package Tree;

import java.util.ArrayList;

public class LevelOrderTraversal {

    public static void main(String[] args) {
       TreeNode node= new TreeNode(-10);
        node.left=new TreeNode(9);
        node.right= new TreeNode(20);
        node.right.left= new TreeNode(15);
        node.right.right= new TreeNode(7);

        for(int i=0; i<10  || i< 20; i++){
            System.out.println("hello");
        }

       // System.out.println(maxPathSum(node));
    }

    public void inOrderTraversal(TreeNode node, ArrayList<Integer> arr){

        inOrderTraversal(node.left,arr);
        arr.add(node.val);
        inOrderTraversal(node.right,arr);
    }
}
