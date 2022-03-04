package class21;

public class ClassAA {

    String name;
    int age;
    double weight;

    public ClassAA(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }

}

class ClassBB extends ClassAA{

    public ClassBB(String name, int age, double weight) {
        super(name, age, weight); // mostly this is how it will be used on your job
    }
//becouse constructor from the parent class don't participate in inheritance
    //we need to create a matching constraction in the child classs as well

}

class Test{
    public static void main(String[] args) {
        ClassBB classBB=new ClassBB("Cece",25,91);
        classBB.printInfo();
    }
}
