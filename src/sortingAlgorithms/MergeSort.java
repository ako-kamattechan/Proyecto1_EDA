package sortingAlgorithms;

public final class MergeSort {
    public static int operations = 0;

    private MergeSort() {}

    private static void merge(int[] arr, int left, int mid, int right) {
        operations += 2;
        int n1 = mid - left + 1;
        int n2 = right - mid;

        operations += 2;
        int[] L = new int[n1];
        int[] R = new int[n2];

        operations += 2;
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
            operations += 2;
        }

        operations += 2;
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[mid + 1 + j];
            operations += 2;
        }

        operations += 3;
        int i = 0, j = 0;
        int k = left;

        operations += 3;
        while (i < n1 && j < n2) {

            operations++;
            if (L[i] <= R[j]) {
                operations += 2;
                arr[k] = L[i];
                i++;
            } else {
                operations += 2;
                arr[k] = R[j];
                j++;
            }

            operations++;
            k++;

            operations += 3;
        }

        operations++;
        while (i < n1) {

            operations += 3;
            arr[k] = L[i];
            i++;
            k++;

            operations++;
        }

        operations++;
        while (j < n2) {
            operations += 3;
            arr[k] = R[j];
            j++;
            k++;
            operations++;
        }

    }

    public static void mergeSort(int[] arr, int left, int right) {
        operations++;
        if (left < right) {
            operations++;
            int mid = (left + right) / 2;

            
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
        initializeOperationCount();
    }

    public static void initializeOperationCount(){
        operations = 0;
    }
}