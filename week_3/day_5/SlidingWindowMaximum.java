import java.util.*;

public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new LinkedList<>();

        int index = 0;

        for (int i = 0; i < n; i++) {

            // Remove elements outside the window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements from back
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.addLast(i);

            // Store maximum value
            if (i >= k - 1) {
                result[index++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }


    public static void main(String[] args) {

        SlidingWindowMaximum obj = new SlidingWindowMaximum();

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] answer = obj.maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(answer));
    }
}