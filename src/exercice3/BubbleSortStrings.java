package exercice3;

public class BubbleSortStrings {
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        String temp = "";
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < (n - i); j++) {
                if(arr[j-1].compareTo(arr[j]) > 0) {
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        String[] arr = {"GeeksforGeeks", "Quiz", "Practice", "Gblogs", "Coding"};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
