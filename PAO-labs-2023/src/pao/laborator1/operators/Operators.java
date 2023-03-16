package pao.laborator1.operators;

public class Operators {
    public static void main(String[] args) {
        boolean b1 = true == false; // false

        boolean b2 = 3 > 10; // false

        System.out.println(b1);
        System.out.println(b2);

        int x = 10;
        int y = 20;
        boolean b3 = y <= x; // false
        System.out.println(b3);

        if (y / x < 5) {
            System.out.println("A");
        } else {
            System.out.println("B");
        } // A

        System.out.println("1 + 2 = " + 1 + 2); // "1 + 2 = 12"
        System.out.println("1 + 2 = " + (1 + 2)); //  "1 + 2 = 3"

        System.out.println(1 + 2 + "abc"); // "3abc"
        System.out.println("abc" + 1 + 2); // "abc12"

        System.out.println("abc" + 10 % 2); // "abc0"

        int a = 10, b = 5, c = 1, result;
        result = a-++c-++b;
        System.out.println(result);

        System.out.println("abc" + 10 / 2); // "abc5"
        System.out.println("abc" + 10 + 2); // "abc102"
        System.out.println(2-1 + "abc"); // "1abc"


        System.out.println(1 + 2 + "abc" + 1 + 2); //"3abc12"

     Long l = 1L;


    }
}
