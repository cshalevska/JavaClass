package class23;

public class AlisParents {
    String girlName="Selma";
    double money=1000000;

    void marry(){
        System.out.println("Ali you should marry"+girlName);
    }
}
class Ali extends AlisParents{
    String girlName="Rihanna";
   void marry(){
        super.marry();
        System.out.println(" But Dad I want to marry"+girlName);

    }
}