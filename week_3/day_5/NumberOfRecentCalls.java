import java.util.*;

public class NumberOfRecentCalls {

    Queue<Integer> queue;

    public NumberOfRecentCalls() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {

        queue.add(t);

        // Remove calls older than t - 3000
        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }


    public static void main(String[] args) {

        NumberOfRecentCalls obj = new NumberOfRecentCalls();

        System.out.println(obj.ping(1));      // 1
        System.out.println(obj.ping(100));    // 2
        System.out.println(obj.ping(3001));   // 3
        System.out.println(obj.ping(3002));   // 3
    }
}