import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Collections;

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
        insertSort(numbers);
        long endAverageCase = System.nanoTime();

        // best case
        long startBestCase = System.nanoTime();
        insertSort(numbers);
        long endBestCase = System.nanoTime();

        // wars case
        Arrays.sort(numbers, Collections.reverseOrder());
        long startWarsCase = System.nanoTime();
        insertSort(numbers);
        long endWarsCase = System.nanoTime();
        System.out.println("The time spend for the best case : " + (endBestCase - startBestCase));
        System.out.println("The time spend for the average case : " + (endAverageCase - startAverageCase));
        System.out.println("The time spend for the verse case : " + (endWarsCase - startWarsCase));
    }

    // insertion sort algorithm
    public static void insertSort(Integer[] numbers) {
        int temp, sortedArrayLength = 1;

        for (int i = 1; i <= numbers.length - 1; i++) {
            temp = numbers[i]; // 3
            for (int j = sortedArrayLength; j >= 1; j--) {
                if (temp < numbers[j-1]) {
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = temp;
                }
            }
            sortedArrayLength += 1;
        }
    }

}