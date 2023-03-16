package pao.laborator2.exercises.statics;

public class PlayWithStatics3 {
    // static variable
    private static int a = 10;

    // instance variable
    private int b = 20;

    // static method
    private static void m1() {
        a = 20;
        System.out.println("from m1");

//        static int c; // static not allowed for local vars

//        b = 10; // // Cannot make a static reference to the non-static field b

//        this.b = 10; //  Cannot use 'this' in a static context

//        m2(); // Cannot make a static reference to the non-static method m2() from the type Test
    }

    // instance method
    void m2() {
        a = 30; // can call static var from non-static mehtod
        m1(); // can call static method from non-static method
        System.out.println("from m2");
    }
}

class Base {
    static int myVar = 0;

    public static void fun() {
        System.out.println("Static fun() called");
    }
}

class Derived extends Base {

    public static void fun() {
//    System.out.println(super.myVar); // statics cannot access this or super
    }
}
