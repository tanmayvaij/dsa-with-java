package sorting;

public class BubbleSort {

    public static void printArray(int[] arr) {
        for (int elem : arr) System.out.print(elem + " ");
        System.out.println();
    }

    public static void sort(int[] arr) {

        for ( int i = 0; i < arr.length - 1; i++ ) {

            boolean isSwapped = false;

            for ( int j = 0; j < arr.length - i - 1; j++ ) {

                if ( arr[j] > arr[j+1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }

            }

            if (!isSwapped) break;

        }

    }

    public static void main(String[] args) {

        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        sort(arr);

        printArray(arr);

    }

}
