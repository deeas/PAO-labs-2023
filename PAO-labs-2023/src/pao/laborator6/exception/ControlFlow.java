package pao.laborator6.exception;

public class ControlFlow {
    public static void main(String[] args) {
       // inTryCatch();

        inTryFinally();

//        inTryCatchFinally();

//        inTryCatchButNotHandled();

 //       inTryCatchFinallyButNotHandled();

//        noExceptionOccur();
    }

    public static void inTryCatch() {
        int[] arr = new int[4];
        try {
            int i = arr[4];
            // nu o sa mai ajunga aici pt ca incercand sa accesam al 5-lea element va arunca exceptie
            System.out.println("Inside try block");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception caught in Catch block");
        }

        System.out.println("Outside try-catch clause");
    }

    public static void inTryFinally() {
        int[] arr = new int[4];
        try {
            int i = arr[4];
            // nu o sa mai ajunga aici pt ca incercand sa accesam al 5-lea element va arunca exceptie
            System.out.println("Inside try block");
        } finally {
            System.out.println("Executing finally");
        }

        System.out.println("Outside try-finally clause");
    }

    public static void inTryCatchFinally() {
        int[] arr = new int[4];
        try {
            int i = arr[4];
            // nu o sa mai ajunga aici pt ca incercand sa accesam al 5-lea element va arunca exceptie
            System.out.println("Inside try block");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception caught in Catch block");
        } finally {
            System.out.println("Executing finally");
        }

        System.out.println("Outside try-catch-finally clause");
    }

    public static void inTryCatchButNotHandled() {
        int[] arr = new int[4];
        try {
            int i = arr[4];
            // nu o sa mai ajunga aici pt ca incercand sa accesam al 5-lea element va arunca exceptie
            System.out.println("Inside try block");
        } catch (NullPointerException ex) {
            System.out.println("Exception caught in Catch block");
        }

        System.out.println("Outside try-catch clause");
    }

    public static void inTryCatchFinallyButNotHandled() {
        int[] arr = new int[4];
        try {
            int i = arr[4];
            // nu o sa mai ajunga aici pt ca incercand sa accesam al 5-lea element va arunca exceptie
            System.out.println("Inside try block");
        } catch (NullPointerException ex) {
            System.out.println("Exception caught in Catch block");
        } finally {
            System.out.println("Executing finally");
        }

        System.out.println("Outside try-catch clause");
    }

    public static void noExceptionOccur() {
        int[] arr = new int[4];
        try {
            int i = arr[3];
            System.out.println("Inside try block");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception caught in Catch block");
        } finally {
            System.out.println("Executing finally");
        }

        System.out.println("Outside try-catch clause");
    }
}
