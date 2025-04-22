package Tree;

import apple.laf.JRSUIUtils;

import java.util.*;

public class ZigZagTraversal {

    public static void main(String[] args) {
            TreeNode node= new TreeNode(10);
            node.left=new TreeNode(20);
            node.right=new TreeNode(30);
            node.left.left=new TreeNode(40);
            node.left.right=new TreeNode(50);
            node.right.left=new TreeNode(60);
            node.right.right=new TreeNode(70);
        List<Integer> list=boundryTraversal(node);
        System.out.println(Collections.singletonList(list));
    }

    private static List<Integer> boundryTraversal(TreeNode node) {

       // if(node== null) return null;
        ArrayList<Integer> res= new ArrayList<>();
        if(!isLeaf(node)) res.add(node.val);
        addLeftTreeExcludeLeave(node, res);
        addLeafs(node,res);
        addRightTreeInReverseOrder(node,res);
        return res;
    }

    private static void addLeafs(TreeNode node, ArrayList<Integer> res) {
        if(isLeaf(node)){
            res.add(node.val);
            return;
        }
        if(node.left!=null) addLeafs(node.left,res);
        if(node.right!=null) addLeafs(node.right,res);
    }

    private static void addRightTreeInReverseOrder(TreeNode node, ArrayList<Integer> res) {
        TreeNode curr= node.right;
        ArrayList<Integer> tmp=new ArrayList<>();
        while(curr!=null){
            if(!isLeaf(curr)) tmp.add(curr.val);
            if(curr.right!=null) curr=curr.right;
            else curr=curr.left;
        }

        for(int i=tmp.size(); i>0; i--){
            res.add(tmp.get(i-1));
        }
    }

    private static void addLeftTreeExcludeLeave(TreeNode node, ArrayList<Integer> res) {
      TreeNode curr= node.left;
      while(curr!=null){
          if(!isLeaf(curr)) res.add(curr.val);
          if(curr.left!=null) curr=curr.left;
          else{
              curr=curr.right;
          }
      }

    }

    private static boolean isLeaf(TreeNode node){
        if(node.left==null && node.right==null) return true;
        else return false;
    }


}

