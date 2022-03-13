package class24;

public class ToStringDemo {
    String name;
    int age;
    ToStringDemo(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String toSring(){
        return name+" "+age;
    }

    public static void main(String[] args) {
        ToStringDemo toStringDemo=new ToStringDemo("Cece",32);
        System.out.println(toStringDemo.toString());
    }
}
