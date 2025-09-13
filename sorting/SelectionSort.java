package sorting;

public class SelectionSort {

    public static void printArray(int[] arr) {
        for (int elem : arr)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

    }

    public static void main(String[] args) {

        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        sort(arr);

        printArray(arr);

    }

}
