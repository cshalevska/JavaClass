package class23;

public class CarTester {
    public static void main(String[] args) {
        BMW bmw=new BMW();
                bmw.start();
                Suzuki suzuki=new Suzuki();
                suzuki.start();
                suzuki.park();
        System.out.println();

        Car car=new BMW();
        car=new Tesla();
        car= new Suzuki();
        car.start();
        //BMW bmw1=new CAr();
        //Obj str=new String("sbdg
    }
}
