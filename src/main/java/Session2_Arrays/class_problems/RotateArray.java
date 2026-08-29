package main.java.Session2_Arrays.class_problems;

public class RotateArray {
    public static int[] rotateArray(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        k = k % nums.length;
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[(i + k) % nums.length] = nums[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 4;
        int[] result = rotateArray(nums, k);
        System.out.print("Rotated Array : ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}