package pao.lab4inclas.interfaces;

public interface BePolite {
    public String sayGoodBye();

    private void beKind() {
        System.out.println("Have a nice day!");
    }

    default void sayGoodByeAndBeKind() {
        sayGoodBye();
        beKind();
    }
}
