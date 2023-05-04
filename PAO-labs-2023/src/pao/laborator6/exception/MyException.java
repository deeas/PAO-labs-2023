package pao.laborator6.exception;

public class MyException extends Exception {
    // default constructor
    MyException() {
    }

    // parametrized constructor
    MyException(String str) {
        // Call constructor of parent Exception
        super(str);
    }

    public static void main(String[] args) {
        try {
            myMethod();
        } catch (MyException e) {
            e.printStackTrace(); // we get name, description + stack trace
            System.out.println(e.toString()); // we get name and description
            System.out.println(e.getMessage()); // we get description
        }
    }

    public static void myMethod() throws MyException {
        throw new MyException("test from method");
    }
}
