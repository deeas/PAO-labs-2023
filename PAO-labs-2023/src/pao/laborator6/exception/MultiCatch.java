package pao.laborator6.exception;

import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("n = ");
            int n = Integer.parseInt(scanner.nextLine());
            if (5 / n > 1) {
                System.out.println(n + " is lower than 5.");
            }
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println(ex.toString());
        }
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = 1;
//
//        try {
//            n = Integer.parseInt(scanner.nextLine());
//        } catch (NumberFormatException ex) {
//            System.out.println(ex.toString());
//        }
//
//        try {
//            if (5 / n > 1) {
//                System.out.println(n + " is lower than 5.");
//            }
//        } catch (ArithmeticException ex) {
//            System.out.println(ex.toString());
//        }
//    }
}
