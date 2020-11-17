package app._01_Recursion_Sorting_Searching.lab;

public class RecursiveFactorial {
    public static void main(String[] args) {
        long f = factorial(5);
        System.out.println(f);
    }

    private static long factorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }
}
