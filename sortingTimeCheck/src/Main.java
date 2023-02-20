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

        // create an array to send to the insertionSort algorithm
        Integer[] numbersInsertionSort = new Integer[1000];
        numbersInsertionSort = numbers;

        // create an array to send to the selectionSort algorithm
        Integer[] numbersSelectionSort = new Integer[1000];
        numbersSelectionSort = numbers;

        // create an array to send to the bubble sort algorithm
        Integer[] numbersBubbleSort = new Integer[1000];
        numbersBubbleSort = numbers;

        /*
            Insertion sort algorithm
         */
        // average case testing
        long startAverageCaseInsertionSort = System.nanoTime();
        insertionSort(numbersInsertionSort);
        long endAverageCaseInsertionSort = System.nanoTime();

        // best case
        long startBestCaseInsertionSort = System.nanoTime();
        insertionSort(numbersInsertionSort);
        long endBestCaseInsertionSort = System.nanoTime();

        // wars case
        Arrays.sort(numbersInsertionSort, Collections.reverseOrder()); // make the array descending
        long startWorseCaseInsertionSort = System.nanoTime();
        insertionSort(numbersInsertionSort);
        long endWorseCaseInsertSort = System.nanoTime();

        System.out.println("**** Insertion sort ****");
        System.out.println("best case : " + (endBestCaseInsertionSort - startBestCaseInsertionSort) + " ns");
        System.out.println("average case : " + (endAverageCaseInsertionSort - startAverageCaseInsertionSort) + " ns");
        System.out.println("worse case : " + (endWorseCaseInsertSort - startWorseCaseInsertionSort) + " ns");
        System.out.println();
        /*
            Selection sort algorithm
         */
        // average case
        long startAverageCaseSelectionSort = System.nanoTime();
        selectionSort(numbersSelectionSort);
        long endAverageCaseSelectionSort = System.nanoTime();

        // best case
        long startBestCaseSelectionSort = System.nanoTime();
        selectionSort(numbersSelectionSort);
        long endBestCaseSelectionSort = System.nanoTime();

        // worse case
        Arrays.sort(numbersSelectionSort, Collections.reverseOrder());
        long startWorseCaseSelectionSort = System.nanoTime();
        selectionSort(numbersSelectionSort);
        long endWorseCaseSelectionSort = System.nanoTime();

        System.out.println("**** Selection sort ****");
        System.out.println("best case : " + (endBestCaseInsertionSort - startBestCaseInsertionSort) + " ns");
        System.out.println("average case : " + (endAverageCaseInsertionSort - startAverageCaseInsertionSort) + " ns");
        System.out.println("worse case : " + (endWorseCaseSelectionSort - startWorseCaseSelectionSort) + " ns");
        System.out.println();
         /*
            Bubble sort algorithm
         */
        // average case testing
        long startAverageCaseBubbleSort = System.nanoTime();
        bubbleSort(numbersBubbleSort);
        long endAverageCaseBubbleSort = System.nanoTime();

        // best case
        long startBestCaseBubbleSort = System.nanoTime();
        bubbleSort(numbersBubbleSort);
        long endBestCaseBubbleSort = System.nanoTime();

        // worse case
        Arrays.sort(numbersBubbleSort, Collections.reverseOrder());
        long startWorseCaseBubbleSort = System.nanoTime();
        bubbleSort(numbersBubbleSort);
        long endWorseCaseBubbleSort = System.nanoTime();

        System.out.println("**** Bubble sort ****");
        System.out.println("best case : " + (endBestCaseBubbleSort - startBestCaseBubbleSort) + " ns");
        System.out.println("average case : " + (endAverageCaseBubbleSort - startAverageCaseBubbleSort) + " ns");
        System.out.println("worse case : " + (endWorseCaseBubbleSort - startWorseCaseBubbleSort) + " ns");
        System.out.println();
    }

    // insertion sort algorithm
    public static void insertionSort(Integer[] numbers) {
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

    // selection sort algorithm
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