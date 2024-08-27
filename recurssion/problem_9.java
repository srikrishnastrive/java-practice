class reverseArray {

    static void reverseArr(int arr[], int l, int r) {
        int temp;
        if (l >= r) {
            return;
        }
        temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArr(arr, l + 1, r - 1);
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");  // Added space for better readability
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        reverseArr(arr, 0, 5);  // Changed 6 to 5 to use the correct index
        System.out.println("The array after reversed:");
        printArray(arr, 6);
    }
}
