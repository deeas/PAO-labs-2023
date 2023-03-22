package pao.laborator3.polimorfism;

class Parent {

    private void m1() {
        System.out.println("From parent m1()");
    }

    protected void m2() {
        System.out.println("From parent m2()");
    }

    static void m3() {
        System.out.println("From parent static m3()");
    }
}

class Child extends Parent {
    // private methods from parent are not overridden
    private int m1() {
        System.out.println("From child m1()");
        return 1;
    }

    // overriding method with more accessibility
    @Override
    public void m2() {
        System.out.println("From child m2()");
    }

    static void m3() {
        System.out.println("From child static m3()");
    }
}
public class DynamicMethodBinding2 {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.m2(); // parent m2
        Parent.m3(); // parent static

        Parent obj2 = new Child();
        obj2.m2(); //child m2
        Parent.m3(); // parent static

        Child obj3 = new Child();
        obj3.m2(); // child m2
        Child.m3(); // child static
    }
}
