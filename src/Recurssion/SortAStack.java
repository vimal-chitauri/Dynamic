package Recurssion;

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(15);
        stack.push(5);
        stack.push(0);

        sort(stack);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());;
        }

        }

      /*  public static  Stack<Integer> sortStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return stack;
        }

        int nums= (int) stack.pop();
        sortStack(stack);
        sorting(stack,nums);
        return stack;
        }

        public static void sorting(Stack<Integer> stack, int nums){

        if(stack.isEmpty() || stack.peek() > nums){
            stack.push(nums);
            return;
        }

         int newNums= stack.pop();
        sorting(stack,newNums);
        stack.push(newNums);

        }*/

        public static Stack<Integer> sort(Stack<Integer> s) {
            if(s.empty()==true){
                return s;

            }

            int num= s.pop();
            sort(s);

            sortedStack(s, num);
            return s;
        }

        public static void sortedStack(Stack<Integer> s, int num){
            if(s.empty()==true || (s.empty()==false && s.peek()>num)){
                s.push(num);
                return;
            }

            int nums= s.pop();
            sortedStack(s, num);
            s.push(nums);

        }

}
