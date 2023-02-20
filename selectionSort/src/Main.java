import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random(); // to generate random numbers
        Integer[] numbers = new Integer[1000]; // array with 1000 elements

        // setting the values to the array
        for (int i = 0; i < 1000; i++) {
            numbers[i] = randomNumberGenerator.nextInt(2000);
        }

        // average case testing
        long startAverageCase = System.nanoTime();
        selectionSort(numbers);
        long endAverageCase = System.nanoTime();

        // best case
        long startBestCase = System.nanoTime();
        selectionSort(numbers);
        long endBestCase = System.nanoTime();

        // wars case
        Arrays.sort(numbers, Collections.reverseOrder());
        long startWarsCase = System.nanoTime();
        selectionSort(numbers);
        long endWarsCase = System.nanoTime();
        System.out.println("The time spend for the best case : " + (endBestCase - startBestCase));
        System.out.println("The time spend for the average case : " + (endAverageCase - startAverageCase));
        System.out.println("The time spend for the verse case : " + (endWarsCase - startWarsCase));
    }

    public static void selectionSort(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

}