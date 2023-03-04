public class Main {
    public static void main(String[] args) {
        System.out.println("summation : " + sumOf(4));
        System.out.println("Multiplication : " + multiplicationOf(5));
        System.out.println("Multipliaction of two numbers : " + multiplicationTwoNumbers(5,4));
        System.out.println("fibonacchi print : " + fibonacciPrint(6));
        SolveHanoi(3, 'A', 'B', 'C');
    }

    public static int sumOf(int n) {
        if (n == 1) {
            return n;
        }
        return n + sumOf(n-1);
    }

    public static int multiplicationOf(int n) {
        if (n == 1) {
            return n;
        }
        return n * multiplicationOf(n-1);
    }

    public static int multiplicationTwoNumbers(int x, int y) {
        if (y == 1) {
            return x;
        }
        return x  + multiplicationTwoNumbers(x, (y-1));
    }

    public static int fibonacciPrint(int n) {
        if (n == 1 || n == 0 ) {
            return n;
        }
        return fibonacciPrint(n-1) + fibonacciPrint(n-2);
    }
                                //plates, from, using, to
    public static void SolveHanoi(int n, char A, char B, char C) {
        if (n == 0) {
            return;
        }
        SolveHanoi(n-1, A, C, B);
        System.out.println("Move plate " + n + " from " + A + " to " + C);
        SolveHanoi(n-1, B, A, C);
    }
}