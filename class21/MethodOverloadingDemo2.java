package class21;

public class MethodOverloadingDemo2 {
    static void printInfo(String name, int age, double weight) {
        System.out.println(name + " " + age + " " + weight);
    }

    static void printInfo(int age, String name, double weight) {
        System.out.println(name + " " + age + " " + weight);
    }

    static void printInfo(int age, double weight, String name) {
        System.out.println(name + " " + age + " " + weight);
    }

    static void printInfo(double weight, int age, String name) {
        System.out.println(name + " " + age + " " + weight);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo2 obj = new MethodOverloadingDemo2();
        obj.printInfo("Mr.B", 16, 28.0); //First Method
        obj.printInfo(36, "Mr.C", 145); // Second Method
        obj.printInfo(33, 135.0, "Mr.D"); // Third Method
        obj.printInfo(31, 155.0, "Mr.E"); // Fourth Method
    }
}