package main;

import utils.TestAlgorithms;

public class Main {
    public static void main(String[] args) {

        System.out.println("BubbleSort");
        TestAlgorithms.test("BubbleSort", 1, 10000);
        System.out.println();

        System.out.println("SelectionSort");
        TestAlgorithms.test("SelectionSort", 1, 10000);
        System.out.println();

        System.out.println("InsertionSort");
        TestAlgorithms.test("InsertionSort", 1, 10000);
        System.out.println();

        System.out.println("HeapSort");
        TestAlgorithms.test("HeapSort", 1, 10000);
        System.out.println();

        System.out.println("QuickSort");
        TestAlgorithms.test("QuickSort", 1, 10000);
        System.out.println();

        System.out.println("MergeSort");
        TestAlgorithms.test("MergeSort", 1, 10000);
        System.out.println();

        System.out.println("JavaDefaultSort");
        TestAlgorithms.test("JavaDefaultSort", 1, 10000);
        System.out.println();

    }
}








































