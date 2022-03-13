package class23;

public class Car {
    void start() { System.out.println("Use keys to start me");}
    void stop() { System.out.println("Use breaks to stop me");}
    void park(){ System.out.println("Park me manually");}
}
class BMW extends Car{
    void start() { System.out.println("Start with button");}
    void stop() { System.out.println("Can use breaks or i can autoBreak");}
    void park() { System.out.println(" Use parking sensores to park me");}
}

class Tesla extends Car{
    void start() { System.out.println("Start with the App");}
    void stop() { System.out.println("Can use breaks or i can autoBreak");}
    void park() { System.out.println(" Use parking sensores to park me or you can autopark");}
}
class Toyota extends Car {
    void start() {System.out.println("Start with the App or remote");}

    void stop() {System.out.println("Can use breaks or i can autoBreak");}

    void park() {System.out.println(" Use parking sensores to park me i can park myself");}
}
class Suzuki extends Car{
    void start() { System.out.println("push me to start");}
    void stop() { System.out.println("I lost my breaks and tires on the way");
    }

}
