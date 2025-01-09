public class FibonacciDemo {
    public static void main(String[] args) {
        int num = 10;

        System.out.println("Term #" + num + " of the Fibonacci sequence is " + fibonacci(num) + ".");
    }

    /***
     * Finds the nth term of the Fibonacci sequence.
     * @param n An int representing the term of the Fibonacci sequence to look for.
     * @return An int representing the nth term of the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}