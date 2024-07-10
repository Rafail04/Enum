public class SelectionSortExample {


        public static void selectionSort(int[] arr) {
            int n = arr.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in unsorted array
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                // Swap the found minimum element with the first element of the unsorted array
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        public static void main(String[] args) {
            int[] arr = { 3, 1, 2, 5, 4, 7, 6 };

            System.out.println("Array before sorting:");
            printArray(arr);

            selectionSort(arr);

            System.out.println("\nArray after sorting:");
            printArray(arr);
        }

        // Utility method to print an array
        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

