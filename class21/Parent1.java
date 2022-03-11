package class21;

public class Parent1 {
    String name="Parent";
    void printName(){
        System.out.println(name);

    }
}
class Child1 extends Parent{
    String name="Child";
    void printName (){
        String name="Cece"; // first priority is given to the locan var
        System.out.println(name);
        // when we use the "this" keyward even thought we have a local var
        // java will ony bring the value from instance var
        System.out.println(this.name);
        /*when we use the "super keyword" even though we have a local variable java
        *java will only bring the values from parent class instance variable
         */
        //System.out.println(super.name); i dk why is not working
    }
}
class ParentTester{
    public static void main(String[] args){
        Child1 child1= new Child1();
        child1.printName();
    }
}