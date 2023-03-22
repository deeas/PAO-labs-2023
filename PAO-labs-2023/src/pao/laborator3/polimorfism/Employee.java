package pao.laborator3.polimorfism;
import pao.laborator3.mostenire.Manager;
public class Employee {
    public static final int base = 10000;

    // base method
    int salary() {
        return base;
    }
}

class Clerk extends Employee {

    // suprascriere corecta, acelasi modificator de vizibilitate, aceeasi semnatura
    int salary() {
        // aici base va fi cel din Employee
        return base + 10000;
    }
}

class AnotherClerk extends Manager {

    // suprascrierea nu se realizeaza deoarece modificatorul de acces din clasa Manager ne limiteaza la clasele din acelasi pachet
    // iar AnotherClerk e in alt pachet decat acesta
    int salary() {
        // aici base va fi cel din Manager
        return base + 10000;
    }
}

class DynamicMethodBinding3 {

    static void printSalary(Employee e) {
        // va apela metoda salary din Employee, daca nu gaseste o suprascriere corecta/vizibila a acesteia
        System.out.println(e.salary());
    }

    public static void main(String[] args) {
        Employee obj1 = new Manager();
        // apeleaza metoda salary() din Employee
        printSalary(obj1);

        Employee obj2 = new Clerk();
        // apeleaza metoda salary() din Clerk
        printSalary(obj2);

        Employee obj3 = new AnotherClerk();
        // apeleaza metoda salary() din AnotherClerk
        printSalary(obj3);

        Manager obj4 = new Manager();
        // apeleaza metoda salary() din Employee
        printSalary(obj4);
    }
}