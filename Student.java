public class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    void disp() {
        System.out.println(name);
        System.out.println(age);
    }
}
