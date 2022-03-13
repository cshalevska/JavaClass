package class23;

public class StaticDemo {

}
class Cat{
    static int NoOfLegs=4;
    String name;
    Cat(String name){
        this.name=name;
    }
    public void printInfo(){
        System.out.println(name+NoOfLegs);
    }
    public static void Print() {
        //System.out.println(name + NoOfLegs); // we can not acess instance filed directly inside static methods
// we can not use intstant fiels with static method
        System.out.println(NoOfLegs);
    }

    public static void main(String[] args) {
        Cat cat=new Cat("Stella");
        Cat.Print();
        Cat cat2= new Cat("Nella");
        Cat.Print();
    }
    }

