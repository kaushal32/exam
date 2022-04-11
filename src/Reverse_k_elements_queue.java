import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_k_elements_queue {
    static Queue<Integer> queue;
    static void reverseQueueFirstKElements(int k)
    {
        if(queue.isEmpty()==true
        || k> queue.size())
            return;
        if(k<=0)
            return;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < k; i++ ){
            stack.push(queue.peek());
            queue.remove();
    }
        while(!stack.empty()){
            queue.add(stack.peek());
            stack.pop();
        }
        for(int i =0; i<queue.size() - k; i++){
            queue.add(queue.peek());
            queue.remove();
        }
        while (!stack.empty()){
            queue.add(stack.peek());
            stack.pop();
        }
        for(int i = 0; i<queue.size() - k ; i++){
            queue.add(queue.peek());
            queue.remove();
        }
    }
    static void Print()
    {
        while(!queue.isEmpty()){
            System.out.println(queue.peek() + " ");
            queue.remove();
        }
    }

    public static void main(String[] args) {
        queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        int k = 3;
        reverseQueueFirstKElements(k);
        Print();
    }
}
