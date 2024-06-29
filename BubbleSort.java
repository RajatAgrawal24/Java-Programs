class BubbleSort {
    public static void swap(int arr[], int j, int k) {
        int c = arr[j];
        arr[j] = arr[k];
        arr[k] = c;
    }

    public static void bubbleSort(int arr[]) {
        for (int a = 0; a < arr.length - 1; a++) {
            for (int j = 0; j < arr.length - 1 - a; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        bubbleSort(arr);
        printArray(arr);
    }
}