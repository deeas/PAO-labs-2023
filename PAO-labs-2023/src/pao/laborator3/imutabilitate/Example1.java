package pao.laborator3.imutabilitate;

public class Example1 {
    public static void main(String[] args) {
        Student s = new Student("Alice", 5);
        changeReference(s);
        System.out.println(s); //Alexandra 9

        changeObject(s);
        System.out.println(s); //10
    }

    static void changeReference(Student st) {
        st = new Student("Bob", 10); // check example1.png
    }

    static void changeObject(Student st) {
        st.setAverageGrade(10);
    }
}

class Student {

    private String name;
    private Integer averageGrade;

    public Student(String name, Integer averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Integer averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}