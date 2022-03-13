package class23;

public class Main {

        String carColor;
        int carYear;
        String carMake;
        String carColor2;
        int carYear2;
        String carMake2;

        public static void main (String[]args){

            Main obj = new Main();
            obj.carColor = "Black";
            obj.carYear = 2019;
            obj.carMake = "BMW";
            obj.carColor2 = "White";
            obj.carYear2 = 2018;
            obj.carMake2 = "Toyota";

            System.out.println("Car color is " + obj.carColor + " and year is " + obj.carYear + " and car model is " + obj.carMake);
            System.out.println("Car color is " + obj.carColor2 + " and year is " + obj.carYear2 + " and car model is " + obj.carMake2);
        }
    }
