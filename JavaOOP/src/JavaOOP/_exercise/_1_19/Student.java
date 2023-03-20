package JavaOOP._exercise._1_19;

public class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    Student(String name, int age){
        System.out.println("Constructing!");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!");
    }

    Student(int age){
        this.age = age;
    }

    Student(String name){
        this.name = name;
    }

    Student(){}
}
