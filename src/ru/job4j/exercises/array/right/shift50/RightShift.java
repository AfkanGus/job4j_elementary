package ru.job4j.exercises.array.right.shift50;

/**
 * 50.Циклический сдвиг вправо
 * с шагом count
 * {1, 2, 3, 4, 5}, count = 1 => {5, 1, 2, 3, 4}
 * <p>
 * {1, 2, 3, 4, 5}, count = 2 => {4, 5, 1, 2, 3}
 */
public class RightShift {

    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }

    private static void shift(int[] nums) {
        int temp = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            nums[i + 1] = nums[i];
        }
        nums[0] = temp;
    }
}
