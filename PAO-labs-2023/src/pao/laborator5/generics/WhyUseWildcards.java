package pao.laborator5.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WhyUseWildcards {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

        // desi neintuitiv, o structura generica GenericStructure<ChildType> nu este un subtip al lui GenericStructure<ParentType>
        List<Object> objectList;
        //objectList = stringList;

        String s = "";
        Object o;
        o = s;

        List<Object> anotherObjectList = new ArrayList<>();

        List<Box> boxes = new ArrayList<>();

        printCollection(stringList);
        printCollection(anotherObjectList);
        printCollection(boxes);

        printCollectionWithGeneric(stringList);
        printCollectionWithGeneric(anotherObjectList);
        printCollectionWithGeneric(boxes);
    }

    static void printCollection(Collection<?> collection) {
        for (Object object : collection) {
            System.out.println(object);
        }
    }

    static <T> void printCollectionWithGeneric(Collection<T> collection) {
        for (T object : collection) {
            System.out.println(object);
        }
    }
}
