package pao.laborator5.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Animal {

    String name;

    public String getName() {
        return name;
    }
}

class Cat extends Animal {
}

class Dog extends Animal {
}
public class DifferenceBetweenWildcardsAndTypeParams {
    // here i can return the concrete type that was passed in
    public static <T extends Animal> Map<T, String> getNames(ArrayList<T> list) {
        Map<T, String> names = new HashMap<>();
        for (T animal : list) {
            names.put(animal, animal.getName());
        }
        return names;
    }

    // here i have to use general Animal
    public static Map<Animal, String> getNamesMap(ArrayList<? extends Animal> list) {
        Map<Animal, String> names = new HashMap<>();
        for (Animal animal : list) {
            names.put(animal, animal.getName());
        }
        return names;
    }

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        Map<Cat, String> map = getNames(cats);
        Map<Animal, String> anotherMap = getNamesMap(cats);
    }
}
