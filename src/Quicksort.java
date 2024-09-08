
public class Quicksort {
	public static int operations = 0;

	public static int partition(int[] arr, int low, int high){
		operations++;
		int pivot = arr[high];
		operations++;
		int i = (low-1);

		operations += 2;
		for (int j=low; j<high; j++){

			operations++;
			if (arr[j] <= pivot){

				operations++;
				i++;
				operations += 3;
				Utils.swap(arr,i,j);

			}

			operations += 2;
		}

		operations += 3;
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;
	}
	
	public static void quickSort(int[] arr, int low, int high){
		operations++;
		if (low < high){
			operations++;
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}

	public static void initializeOperationCount(){
		operations = 0;
	}

}
