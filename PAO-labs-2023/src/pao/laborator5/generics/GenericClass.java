package pao.laborator5.generics;

// type parameter section is delimited by angle brackets (< and >)
public class GenericClass<T>{  // T − The generic type parameter passed to generic class. It can take any Object.
    private T t; // compilation error if missed the <T>

    // compilation error if missed the <T>
    public void add(T t) { // A type parameter, also known as a type variable, is an identifier that specifies a generic type name.
        this.t = t;
    }

    // type parameter precedes the method's return type, if not specified in the class definition
    <V> void print(V param) {
        System.out.println(param.toString());
    }

    // compilation error if missed the <T>
    public T get() {
        return t;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "t=" + t +
                '}';
    }

    public static void main(String[] args) {
        // example of raw use of generics - everything is replaced with Object if generic type is not specified
        GenericClass everything = new GenericClass();
        everything.add("string");
        System.out.println(everything);
        everything.add(1L);
        System.out.println(everything);
        everything.add(2);
        System.out.println(everything);
        everything.add(null);
        System.out.println(everything);

        // best practice is to be specific, always indicate type of objects
        GenericClass<String> string = new GenericClass<String>();
        string.add("string1");
        System.out.println(string.get());
        string.print(string);

        // using diamond operator, compiler determines the type of the parameter. This operator is available from Java SE 7 version onwards.
        GenericClass<Integer> integer = new GenericClass<>();
        integer.add(1);
        System.out.println(integer.get());
        string.print(integer);

        GenericClass anything = new GenericClass(); //raw type
        anything.add("A string");
        anything.add(10);
        System.out.println(anything);
    }
}
