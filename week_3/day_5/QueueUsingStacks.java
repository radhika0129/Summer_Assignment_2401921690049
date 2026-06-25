import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> input;
    Stack<Integer> output;

    public QueueUsingStacks() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {

        moveElements();

        return output.pop();
    }

    public int peek() {

        moveElements();

        return output.peek();
    }

    public boolean empty() {

        return input.isEmpty() && output.isEmpty();
    }

    private void moveElements() {

        if (output.isEmpty()) {

            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }


    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.peek());   // 1

        System.out.println(queue.pop());    // 1

        System.out.println(queue.empty());  // false
    }
}