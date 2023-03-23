package JavaOOP._3_20;

public class Student {
    private String name;
    private int age;
    private String surname;
    private double grades;
    private String whereIsHeFrom;
    private double averageGrades = 0;
    private int counterGrades = 0;
    private double sumOfGrades = 0;

    void setName(String name) {
        if (name.isBlank() || !name.trim().matches("[a-zA-Z]+")){
            System.out.println("Invalid Name");
        } else {
            this.name = name;
        }
    }

    String getName(){
        return this.name;
    }

    void setAge(int age) {
        if (age <= 0){
            System.out.println("Invalid Age");
        } else {
            this.age = age;
        }
    }

    int getAge(){
        return this.age;
    }


    void setSurname(String surname) {
        if (surname.isBlank() || !surname.trim().matches("[a-zA-Z]+")){
            System.out.println("Invalid Surname");
        } else {
            this.surname = surname;
        }
    }

    String getSurname(){
        return this.surname;
    }

    void setGrades(double grades) {
        if (grades < 0 || grades > 10){
            System.out.println("Invalid grades");
        } else {
            counterGrades++;
            sumOfGrades += grades;
            this.grades = grades;
        }
    }

    double getAverageGrades(){
        return this.averageGrades = sumOfGrades / counterGrades;
    }

    int getCounterGrades(){
        return this.counterGrades;
    }

    Double getGrades(){
        return this.grades;
    }

    void setWhereIsHeFrom(String whereIsHeFrom) {
        if (whereIsHeFrom.toLowerCase().equals("italy")){
            System.out.println("We don't accept pizza lovers here");
        } else {
            this.whereIsHeFrom = whereIsHeFrom;
        }
    }

    String getWhereIsHeFrom(){
        switch (whereIsHeFrom.toLowerCase()) {
            case "italy" -> System.out.println("We love pizza too");
            case "england" -> System.out.println("There's nothing better than a cup of tea while studying!");
            case "france" -> System.out.println("Oui oui baguette très bon!");
            default -> System.out.println("There's nothing special about your home country :(");
        }
        return this.whereIsHeFrom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                ", grades=" + grades +
                ", whereIsHeFrom='" + whereIsHeFrom + '\'' +
                '}';
    }
}
