public class JavadocPractice {

    /**
     * Contains various methods mainly methodsthat modify and check data for integers.
     *Runs all of the methods to ensure that they function corrctly.
     * 
     */


    /**
     * Runs all the methods to test them and show how they work.
     * Program's entry pint. Runs when you run program.
     * 
     * @param args Coomand Line Arguments
     */
    public static void main(String[] args) {
        printWelcome();
        int result = add(4, 9);
        System.out.println("4 + 9 = " + result);
        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Max of 3 and 7 is " + max(3, 7));
    }


    /**
     * Adds two values together.
     * 
     * @param a first input value for adding
     * @param b second input value to be added to the first.
     * @return what those two values added together is equal to.
     * 
     */
    public static int add(int a, int b) {
        return a + b;
    }


    /**
     * Determines is a value is even
     * 
     * @param value value that you want to check whether it is even
     * @return true if value is even; false if odd
     */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }


    /**
     * Displays a welcome message.
     */
    public static void printWelcome() {
        System.out.println("Welcome to the Javadoc practice file.");
    }


    /**
     * Determines the maximum of two integer values.
     * 
     * @param x First input value to check.
     * @param y Second input value to check.
     * @return Which of the input values is greater.
     */
    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }
}
