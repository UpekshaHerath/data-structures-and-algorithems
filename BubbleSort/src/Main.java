import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random(); // to generate random numbers
        Integer[] numbers = new Integer[1000]; // array with 1000 elements

        // setting the values to the array
        for (int i = 0; i < 1000; i++) {
            numbers[i] = randomNumberGenerator.nextInt(2000);
        }

        // average case testing
        long startAverageCase = System.nanoTime();
        bubbleSort(numbers);
        long endAverageCase = System.nanoTime();

        // best case
        long startBestCase = System.nanoTime();
        bubbleSort(numbers);
        long endBestCase = System.nanoTime();

        // wars case
        Arrays.sort(numbers, Collections.reverseOrder());
        long startWarsCase = System.nanoTime();
        bubbleSort(numbers);
        long endWarsCase = System.nanoTime();
        System.out.println("The time spend for the best case : " + (endBestCase - startBestCase));
        System.out.println("The time spend for the average case : " + (endAverageCase - startAverageCase));
        System.out.println("The time spend for the verse case : " + (endWarsCase - startWarsCase));
    }

    public static void bubbleSort(Integer[] numbers) {
        for (int j = 0; j < numbers.length-1; j++) {
            for (int i = 0; i < numbers.length-1; i++) {
                if (numbers[i] > numbers[i+1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }
    }
}