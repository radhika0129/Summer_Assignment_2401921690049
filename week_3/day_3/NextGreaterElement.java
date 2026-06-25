import java.util.*;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Find next greater element for nums2
        for (int i = nums2.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], stack.peek());
            }

            stack.push(nums2[i]);
        }

        // Create result for nums1
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }


    public static void main(String[] args) {

        NextGreaterElement obj = new NextGreaterElement();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] answer = obj.nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(answer));
    }
}