package pao.lab4inclas.interfaces;

import pao.lab4inclas.interfaces.Greet;

public class MyClass  implements BePolite, Greet {

    private static final String BYE = "Bye bye";
    @Override
    public String sayGoodBye() {
        return BYE;
    }

    @Override
    public String sayHello() {
        return HELLO;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClass.sayGoodMorning();

        Greet.print(myClass.sayHello());
        Greet.print(myClass.sayGoodBye());

        myClass.sayGoodByeAndBeKind();
    }
}
