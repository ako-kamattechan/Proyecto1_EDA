package sortingAlgorithms;

import utils.Utils;

public class HeapSort {
    public static int operations =0;
    public static int heapSize=0;
    public static void Heapsort(int[] arr){
        int size;
        size =arr.length;
        operations++;
        BuildHeap(arr,size);
          int i;
          operations+=2;//asignamiento y comparacion del for
          for(i = size - 1; i > 0; i--){
            operations+=3;//swap
            Utils.swap(arr,0, heapSize);
              heapSize--;
              operations+=1;//suma de heapsize
              Heapify(arr, 0,size);
              operations+=2;//comparacion de i, resta de i
       }
    }
    
    public static void Heapify(int[] arr, int i, int size)
    {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        operations+=2;// asignaciones
        int largest;
    
        if(l <= heapSize && arr[l] > arr[i]){
            operations++;
            largest = l;
        }
          else{
            largest = i;
            operations+=1;
          }
          if(r <= heapSize && arr[r] > arr[largest]){
            largest = r;
            operations++;
          }
          if(largest != i){
            operations+=3;//funcion swap
            Utils.swap(arr, i, largest);
            Heapify(arr, largest,size);
         }
        
    }
    
    public static void BuildHeap(int[] arr, int size){
        heapSize = size - 1;
        operations++;
          int i;
          operations+=2;//asignamiento y comparacion
          for(i = (size - 1) / 2; i >= 0; i--){
            Heapify(arr, i,size);
            operations+=2;//resta y comparacion
          }
    }
    public static void initializeOperationCount(){
        operations=0;
    }
    public static void initializeheapSize(){
        heapSize=0;
    }
}
