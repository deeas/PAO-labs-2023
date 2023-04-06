package pao.laborator5.generics;

public class Box<T, S> {
    private T t;
    private S s;

    public void add(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getFirst() {
        return t;
    }

    public S getSecond() {
        return s;
    }

    public static void main(String[] args) {
        Box<Integer, String> box = new Box<>();
        box.add(10, "Hello World");
        System.out.println("Integer Value: " + box.getFirst());
        System.out.println("String Value :" + box.getSecond());

        Box<String, String> box1 = new Box<>();
        box1.add("Message", "Hello World");
        System.out.println("String Value: " + box.getFirst());
        System.out.println("String Value :" + box.getSecond());
    }
}
