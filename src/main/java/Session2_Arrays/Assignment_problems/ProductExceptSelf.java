package main.java.Session2_Arrays.Assignment_problems;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        int product = 1;

        // Product of elements on the left
        for (int i = 0; i < nums.length; i++) {
            answer[i] = product;
            product = product * nums[i];
        }

        product = 1;

        // Multiply by product of elements on the right
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * product;
            product = product * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);

        System.out.print("Output: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}