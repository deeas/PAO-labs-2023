package pao.laborator4.interfaces;

public interface BePolite {
    public String sayGoodBye();

    default void sayGoodByeAndBeKind() {
        sayGoodBye();
        beKind();
    }

    //An interface can have private methods since Java 9 version.
    // These methods are visible only inside the class/interface, so it's recommended to use private methods for confidential code.
    // That's the reason behind the addition of private methods in interfaces.
    private void beKind() {
        System.out.println("Have a nice day!");
    }
}
