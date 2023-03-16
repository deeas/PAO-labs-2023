package pao.laborator2.main;

import pao.laborator2.model.Animal;
import pao.laborator2.model.Bird;
import pao.laborator2.model.Cat;
import pao.laborator2.model.CatBreed;

public class Exercise {

    public static void main(String[] args) {
        Animal animal = new Animal("Max", "ham");
        Bird bird = new Bird("chip-chip");

        // members of class overriding
        //System.out.println(animal.noOfLegs);
        //System.out.println(bird.noOfLegs);
        System.out.println(animal.getNoOfLegs());
        System.out.println(bird.getNoOfLegs());

        Animal a1 = new Animal("Max", "ham-ham");
        Animal a2 = new Animal("Max", "ham");
        Animal a3 = a1;

        // EQUALS
        // if we don't override .equals(), it compares the reference (same as "==")
        System.out.println(a1.equals(a2));
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a3));
        System.out.println(a1 == a3);

        // but if we do, it does what we expected
        Cat c1 = new Cat("Marie", "meow", CatBreed.BRTISH_SHORT_HAIR);
        Cat c2 = new Cat("Marie", "meow", CatBreed.BRTISH_SHORT_HAIR);
        Cat c3 = c1;

        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c1.equals(c3));

        Cat c4 = new Cat("Marie", "meow123", CatBreed.BRTISH_SHORT_HAIR);
        System.out.println(c1.equals(c4));

        // OVERRIDE
        // printName method overridden in cat
        a1.printName();
        c1.printName();
        bird.printName();

        // move method overridden in Bird
        a1.move();
        c1.move();
        bird.move();

        // toString
        System.out.println(a1.toString());
        System.out.println(c1.toString());

    }
}