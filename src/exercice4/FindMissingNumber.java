package exercice4;

public class FindMissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2; // sum of first N integers
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = arr.length + 1; // missing number is one of the first N integers
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("Missing number is: " + missingNumber);
    }
}
