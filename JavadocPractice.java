public class JavadocPractice {

    // ------------------------------------------------------------
    // TODO: Write a class-level Javadoc comment here.
    // Describe the purpose of this class in 1–2 sentences.
    // ------------------------------------------------------------


    /**
     * TODO: Write a full Javadoc block for this method.
     * This is your program's entry point.
     */
    public static void main(String[] args) {
        printWelcome();
        int result = add(4, 9);
        System.out.println("4 + 9 = " + result);
        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Max of 3 and 7 is " + max(3, 7));
    }


    /**
     * TODO: Write the full Javadoc block for this method.
     * Should include @param and @return tags.
     */
    public static int add(int a, int b) {
        return a + b;
    }


    /**
     * TODO: Write the full Javadoc block for this method.
     * Should include @param and @return tags.
     */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }


    /**
     * TODO: Write the full Javadoc block for this method.
     * This method takes no parameters and does not return anything.
     */
    public static void printWelcome() {
        System.out.println("Welcome to the Javadoc practice file.");
    }


    /**
     * TODO: Write the full Javadoc block for this method.
     * Should include @param and @return tags.
     */
    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }
}
