package pao.laborator2.exercises.finals;

public class PlayWithFinal {
    // constant in java: static + final
    static final int MY_CONSTANT = 10;

    // direct initialize
    final int THRESHOLD = 5;

    // a blank final variable
    final int CAPACITY;

    // another blank final variable
    final int MINIMUM;

    // direct initialize
    static final double PI = 3.141592653589793;

    // a  blank final static  variable
    static final double EULER_CONSTANT;

    // instance initializer - is called only when we have a constructor call
    {
        CAPACITY = 25;
        System.out.println("THRESHOLD: " + THRESHOLD);
        System.out.println("CAPACITY: " + CAPACITY);
    }

    // static initializer block
    static {
        EULER_CONSTANT = 2.3;
    }

    // instance initializer - is called only when we have a constructor call
    {
        System.out.println("SECOND initializer block!");
    }

    // constructor for initializing MINIMUM
    public PlayWithFinal() {
        MINIMUM = -1;
        System.out.println("MINIMUM: " + MINIMUM);
    }

    public static void main(String[] args) {
        System.out.println("PI: " + PI);
        System.out.println("EULERCONSTANT: " + EULER_CONSTANT);

        //CAPACITY = 5; // is not static (non static cannot be referenced from a static context)
        //MY_CONSTANT = 10; // re-assigning is not possible

        new PlayWithFinal();
    }
}
