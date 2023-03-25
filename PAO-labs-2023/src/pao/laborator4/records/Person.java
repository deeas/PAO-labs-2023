package pao.laborator4.records;

import java.util.Objects;

public record Person(String name, int age) {

     public Person(int age) {
        this("Unknow", age);
    }
}
