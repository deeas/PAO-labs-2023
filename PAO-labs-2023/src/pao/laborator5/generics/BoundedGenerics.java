package pao.laborator5.generics;

import java.util.ArrayList;
import java.util.List;

class Chocolate {
    protected String name = "Chocolate";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "name='" + name + '\'' +
                '}';
    }
}

class White extends Chocolate {
    public White() {
        name = "White";
    }
}

class Dark extends Chocolate {
    public Dark() {
        name = "Dark";
    }
}

public class BoundedGenerics {
/*
    Type parameters can be bounded. Bounded means “restricted,” and we can restrict the types that a method accepts.
    For example, we can specify that a method accepts a type and all its subclasses (upper bound)
    or a type and all its superclasses (lower bound).
*/
public static <T extends Chocolate> void listChocolate(T[] chocolateArray) {
    System.out.println("We have different types of chocolate");
    for (T t : chocolateArray) {
        System.out.println(t.getName());
    }
}

    public static void main(String[] args) {
        BoundedGenerics.listChocolate(new Chocolate[] {new Dark(), new White(), new Chocolate()});

        // folosim lower bound in general cand vrem sa modificam o colectie
        List<? super Chocolate> lowerBoundChocolateList = new ArrayList<>();
        lowerBoundChocolateList.add(new Dark());
        lowerBoundChocolateList.add(new White());
        lowerBoundChocolateList.add(new Chocolate());
        //lowerBoundChocolateList.add(new Chocolate());
        System.out.println(lowerBoundChocolateList.toString());
    }
}
