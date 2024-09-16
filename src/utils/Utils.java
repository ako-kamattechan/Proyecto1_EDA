package utils;

import java.util.LinkedList;
import java.util.Random;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {
    public static void swap(int[] arr, int a, int b) {
        int aux = arr[a];
        arr[a] = arr[b];
        arr[b] = aux;
    }

    public static void fillArrayRandomly(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000)+1;
        }
    }

    public static double average(LinkedList<Integer> list){
        double sum = 0;
        for (Integer operationNum : list) {
            sum += operationNum;
        }
        return sum/list.size();
    }

    public static void writeAverageToFile(double average, String sortingAlgorithm) {
        String file = "averages";
        file = file.concat(sortingAlgorithm+".txt");


        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))){
            writer.write(Double.toString(average));
            writer.newLine();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
