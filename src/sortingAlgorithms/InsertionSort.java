package sortingAlgorithms;

public class InsertionSort {
    public static int operations=0;
    public static void insertionsort(int[] arr){
        int n,index,j;
        n=arr.length;
        operations+=3;//asignacion de n, asignacion de i,comparacion
        for(int i=0;i<n;i++){
            index=arr[i];
            j=i-1;
            operations+=4;//comparacion de j y comparacion de index, valor de index y valor de j
            while(j>0&&arr[j]>index){
                arr[j+1]=arr[j];
                j=j-1;
                operations+=4;//comparacion de j e index, valor de arr[j+1] y valor de j
            }
        arr[j+1]=index;
        operations+=3;//comparacion de i, suma de i,igualacion arr[j+1]
        }
    }
    public static void initializeOperationCount(){
        operations=0;
    }
}
