package utils;

import sortingAlgorithms.*;
import java.util.LinkedList;

public class TestAlgorithms {
    public static LinkedList<Integer> operationNum = new LinkedList<>();
    public static double startTime, endTime;

    public static void test(String algorithmName, int start, int end) {
        int i;
        int[] arr;

        startTime = System.nanoTime();

        switch (algorithmName){
            case "BubbleSort"-> {
                for (i = start; i < end + 1; i++) {
                    arr = new int[i];
                    bubbleSortExecutions(arr);
                    Utils.writeAverageToFile(Utils.average(operationNum), algorithmName);
                    operationNum.clear();
                }
            }

            case "QuickSort"-> {
                for(i = start; i < end+1; i++) {
                    arr = new int[i];
                    quickSortExecutions(arr);
                    Utils.writeAverageToFile(Utils.average(operationNum), algorithmName);
                    operationNum.clear();
                }
            }

            case "MergeSort"-> {
                for(i = start; i < end+1; i++) {
                    arr = new int[i];
                    mergeSortExecutions(arr);
                    Utils.writeAverageToFile(Utils.average(operationNum), algorithmName);
                    operationNum.clear();
                }
            }

            case "JavaDefaultSort"-> {
                for(i = start; i < end+1; i++) {
                    arr = new int[i];
                    javaSortExecutions(arr);
                    Utils.writeAverageToFile(Utils.average(operationNum), algorithmName);
                    operationNum.clear();
                }
            }

            case "HeapSort"-> {
                for(i = start; i < end+1; i++) {
                    arr = new int[i];
                    heapSortExecutions(arr);
                    Utils.writeAverageToFile(Utils.average(operationNum), algorithmName);
                    operationNum.clear();
                }
            }

            case "SelectionSort"-> {
                for(i = start; i < end+1; i++) {
                    arr = new int[i];
                    selectionSortExecutions(arr);
                    Utils.writeAverageToFile(Utils.average(operationNum), algorithmName);
                    operationNum.clear();
                }
            }

            case "InsertionSort"-> {
                for(i = start; i < end+1; i++) {
                    arr = new int[i];
                    insertionSortExecutions(arr);
                    Utils.writeAverageToFile(Utils.average(operationNum), algorithmName);
                    operationNum.clear();
                }
            }
        }

        endTime = System.nanoTime();
        System.out.println("Tiempo de ejecución de "+algorithmName+" para 10000 arreglos de tamaño n(5 ejecuciones por tamaño): "+(endTime - startTime)/1000000000+" segundos");
    }


    public static void bubbleSortExecutions(int[] arr){
        for (int j = 0; j < 5; j++) {
            Utils.fillArrayRandomly(arr);
            BubbleSort.bubbleSort(arr);
            operationNum.add(BubbleSort.operations);
            BubbleSort.initializeOperationCount();
        }
    }

    public static void quickSortExecutions(int[] arr){
        for (int j = 0; j < 5; j++) {
            Utils.fillArrayRandomly(arr);
            Quicksort.quickSort(arr, 0, arr.length - 1);
            operationNum.add(Quicksort.operations);
            Quicksort.initializeOperationCount();
        }
    }

    public static void mergeSortExecutions(int[] arr){
        for (int j = 0; j < 5; j++) {
            Utils.fillArrayRandomly(arr);
            MergeSort.mergeSort(arr, 0, arr.length - 1);
            operationNum.add(MergeSort.operations);
            MergeSort.initializeOperationCount();
        }
    }

    public static void javaSortExecutions(int[] arr){
        for (int j = 0; j < 5; j++) {
            Utils.fillArrayRandomly(arr);
            JavaDefaultSort.sort(arr);
            operationNum.add(JavaDefaultSort.operations);
            JavaDefaultSort.initializeOperationCount();
        }
    }

    public static void heapSortExecutions(int[] arr){
        for (int j = 0; j < 5; j++) {
            Utils.fillArrayRandomly(arr);
            HeapSort.Heapsort(arr);
            operationNum.add(HeapSort.operations);
            HeapSort.initializeOperationCount();
            HeapSort.initializeheapSize();
        }
    }

    public static void insertionSortExecutions(int[] arr){
        for (int j = 0; j < 5; j++) {
            Utils.fillArrayRandomly(arr);
            InsertionSort.insertionsort(arr);
            operationNum.add(InsertionSort.operations);
            InsertionSort.initializeOperationCount();
        }
    }

    public static void selectionSortExecutions(int[] arr){
        for (int j = 0; j < 5; j++) {
            Utils.fillArrayRandomly(arr);
            SelectionSort.selectionSort(arr);
            operationNum.add(SelectionSort.operations);
            SelectionSort.initializeOperationCount();
        }
    }

}
