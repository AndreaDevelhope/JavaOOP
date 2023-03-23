package JavaOOP._3_20;

//import JavaOOP._exercise._2_19.Student;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student student = new Student();
        student.setName("Carlo");
        System.out.println(student.getName());
        student.setSurname("Rossi");
        System.out.println(student.getSurname());
        student.setAge(25);
        System.out.println(student.getAge());
        student.setGrades(9.78);
        System.out.println(student.getGrades());
        student.setWhereIsHeFrom("England");
        System.out.println(student.getWhereIsHeFrom());
        System.out.println(student);

    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Student student = new Student();
        student.setAge(24);
        student.setAge(-2);
        student.setName("Andrea");
        student.setName("4ndr3a");
        student.setSurname("Rossi");
        student.setSurname("Ross1");
        student.setGrades(12);
        student.setGrades(-2);
        student.setGrades(8);
        student.setGrades(9.78);
        student.setGrades(4.56);
        student.setGrades(6.56);
        System.out.println(student.getName() + " " + student.getSurname() + " ha sostenuto " + student.getCounterGrades() + " esami e ha una media pari a :" + student.getAverageGrades());
        student.setWhereIsHeFrom("France");
        student.getWhereIsHeFrom();
        System.out.println(student);
    }

}