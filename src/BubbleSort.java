
public class BubbleSort{
	public static int operations = 0;

	public static void bubbleSort(int[] arr){
		int i, a, size;
		operations += 2; //asignamiento de size=arr.length y a=1
		size = arr.length;
		a = 1;

		operations++; //condición a==1
		while(a==1){
			operations++; //asignamiento a=0
			a = 0;

			operations += 2; //asignamiento i=0 y condición i<size-1
			for(i=0; i<size-1; i++){

				operations++; //condición arr[i]>arr[i+1]
				if(arr[i]>arr[i+1]){
					operations += 3; //swap 3 asignaciones
					Utils.swap(arr,i,i+1);
					operations++; //asignamiento a=1
					a = 1;
				}
				operations += 2; //asignamiento i++ y condición i<size-1
			}
			operations++; //condición a==1
		}
	}

	public static void initializeOperationCount(){
			operations = 0;
	}

}


