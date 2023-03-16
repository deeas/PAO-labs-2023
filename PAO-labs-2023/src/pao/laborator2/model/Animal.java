package pao.laborator2.model;

import java.util.Objects;

public class Animal {
    private int noOfLegs = 4;
    // good practice: fields should be private, and should have public getters/setters
    private String sound;

    private String name;

    private int age;

    private String food;

    public Animal() {
    }

    public Animal(int noOfLegs) {
        this.noOfLegs = noOfLegs;
        System.out.println("Animal has " + noOfLegs + "legs");
    }

    // supraincarcare constructor
    public Animal(String name, String sound) {
        // this call must be first statement
        this(sound); // constructor chaining
        this.name = name;
    }

    public Animal(String sound) {
        this.sound = sound;
    }

    // no return value -> void
    public void animalSound() {
        System.out.println("The animal makes a sound: " + this.sound);
    }

    public void printName() {
        System.out.println("This animal's name is: " + this.name);
    }

    // supraincarcarea (overloading) a metodei printName
    public void printName(String name) {
        System.out.println("I wish my animal's name were: " + name + " but is: " + this.name);
    }

    public void printName(String name, int age) {
        System.out.println("I wish my animal's name were: " + name + " but is: " + this.name + " and his age is: " + age);
    }

    public void move() {
        System.out.println("I can walk!");
    }

    // generated getters and setters; in Intellij command is Alt+Insert
    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return getNoOfLegs() == animal.getNoOfLegs() && getAge() == animal.getAge() && getSound().equals(animal.getSound()) && getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNoOfLegs(), getSound(), getName(), getAge());
    }
}

