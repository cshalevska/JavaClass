package class24;

public class Parent {
    final String name="Emiliy";
   final void method(){ // if we dont wanna to inheritade to another classes we write final
       // name="Cece"; we can not override the name if the variable is final
        System.out.println("I am parent");

    }
}
class Child extends Parent{
    /*void method(){
        can't override bocouse it is final method
    }*/
}