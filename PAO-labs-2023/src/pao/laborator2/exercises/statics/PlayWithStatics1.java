package pao.laborator2.exercises.statics;

public class PlayWithStatics1 {
    // static variable
    private static int x = 10;
    private static int y;

    /**
     * Used for initializing static vars.
     * This block gets executed when the class is loaded in the memory.
     * A class can have multiple Static blocks, which will execute in the same sequence in which they have been written into the program.
     */
    static {
        System.out.println("Static block initialized.");
        y = x * 4;
    }

    public static void main(String[] args) {
        System.out.println("Value of x : " + x);
        System.out.println("Value of y : " + y);
    }
}
