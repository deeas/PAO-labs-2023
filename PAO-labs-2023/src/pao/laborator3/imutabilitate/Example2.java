package pao.laborator3.imutabilitate;

// All primitive wrapper classes (Integer, Byte, Long, Float, Double, Character, Boolean and Short) are immutable in Java,
// so operations like addition and subtraction create a new object and not modify the old.
public class Example2 {
    public static void main(String[] args) {
        Integer i = 12;

        modify(i);
        System.out.println(i); // 12

        i = modifyValue(i);
        System.out.println(i); // 13
    }

    private static void modify(Integer i) {
        i = i + 1;
    }

    private static Integer modifyValue(Integer i) {
        return i + 1;
    }
}
