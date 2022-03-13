package class24;

class Student {
    void study() {
        System.out.println("Students must study to pass");
    }

    void doHomeWork() {
        System.out.println("Strudents must do homeworks");
    }

    void practice() {
        System.out.println("Students must practice");
    }
}

class SyntaxStudent extends Student {
    void study() {
        System.out.println("Syntax students must study 25 h a week");
    }

    void doHomeWork() {
        System.out.println("Syntax Students must solve Repls");
    }

    @Override
    void practice() {
        System.out.println("Syntax Students must do thier own reseach");
    }
}

class CollegeStudent extends Student {
    @Override
    void doHomeWork() {
        System.out.println(" College students can skip some of the homework");
    }
}

class SchoolStudent extends Student {

}

public class Task1 {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
     *Define common behavior within parent class and override some of the methods in child classes
     *Define some methods specific to child classes
     *Write example of achieving run time polymorphism
     */


}

