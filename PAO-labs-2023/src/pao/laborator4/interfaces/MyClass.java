package pao.laborator4.interfaces;

public class MyClass implements BePolite, Greet{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.sayGoodMorning();

        Greet.print(myClass.sayHello());
        Greet.print(myClass.sayGoodBye());
        myClass.sayGoodByeAndBeKind();

    }
    private final static String BYE = "Bye bye!";
    @Override
    public String sayGoodBye() {
        return BYE;
    }

    @Override
    public String sayHello() {
        return HELLO;
    }
}
