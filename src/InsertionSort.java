public class SelectionSort {
    public static int operations=0;
    public static void selectionSort(int[] arr){
        int n,min;
        n=arr.length;
        operations+=3;//dio valor a n, dio valor a i, comparo i
        for(int i=1;i<n-1;i++){
            min=i;
            operations+=3;//dio valor a min,diovalor a j, comparo j
            for(int j=i+1;j<n;j++){
                operations++;//comparacion
                if(arr[j]<arr[min]){
                    min=j;
                    operations++;//dio valor a min
                }
                operations+=2;//comparacion y suma a j
            }
            operations+=3;//swap
            Utils.swap(arr,i,min);
            operations+=2;//comparacion de i, suma a i
        }
    }
    public static void initializeOperationCount(){
        operations=0;
    }
}
