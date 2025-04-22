package Tree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InOrderIterativeTraversal {

    static class Node{
        Node left;
        Node right;
        int key;
        Node(int key){
            this.key=key;
        }

    }


    public static void main(String[] args) {
        Node node= new Node(10);
        node.left=new Node(20);
        node.right=new Node(30);
        node.left.left=new Node(40);
        node.left.right=new Node(50);
        node.right.left=new Node(60);
        node.right.right=new Node(70);

        iterativeInOrderTraversal(node);
        iterativePreOrderTraversal(node);
        postOrderTraversal(node);

    }

    public static void iterativeInOrderTraversal(Node node){
        Node curr= node;
        System.out.println("In Order iterative approach: ");
        Stack<Node> stack = new Stack<>();
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }

            curr=stack.pop();;
            System.out.print(" "+curr.key);
            curr=curr.right;
        }
    }

    public static void iterativePreOrderTraversal(Node node){
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        Node curr=node;
        System.out.println();
        System.out.print("Pre Order iterative approach: ");

        while(!stack.isEmpty()){
            curr=stack.pop();
            System.out.print(curr.key+" ");
            if(curr.right!=null){
                stack.push(curr.right);
            }
            if(curr.left!=null){
                stack.push(curr.left);
            }
        }
    }

    public static void postOrderTraversal(Node node){

        Stack<Node> stackLeft= new Stack<>();
        Stack<Node> stackRight= new Stack<>();
        stackLeft.push(node);
        Node curr = node;

        System.out.println();
        System.out.println("Post Order");

        while(!stackLeft.isEmpty()){

            curr= stackLeft.pop();
            stackRight.push(curr);

            if(curr.left!=null){
                stackLeft.push(curr.left);
            }

            if(curr.right!=null){
                stackLeft.push(curr.right);
            }

        }

        while(!stackRight.isEmpty()){
            System.out.print(stackRight.pop().key+" ");
        }

    }
}
