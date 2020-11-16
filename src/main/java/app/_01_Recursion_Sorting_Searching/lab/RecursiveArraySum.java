package app._01_Recursion_Sorting_Searching.lab;

public class RecursiveArraySum {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50};
        int sum = findSum(arr, 0);
        System.out.println(sum);
    }

    private static int findSum(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }

        return array[index] + findSum(array, index + 1);
    }
}
