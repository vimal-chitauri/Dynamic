package Recurssion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAStack {
    class Solution
    {
         void reverse(Stack<Integer> s)
        {
            Queue<Integer> q= new LinkedList<>();

            if(!s.isEmpty()){
                q.add(s.peek());
                s.pop();
            }else{
                return;
            }

            reverse(s);

            while(!q.isEmpty()){
                s.push(q.peek());
                q.poll();
            }

        }
    }
}
