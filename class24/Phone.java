package class24;

public abstract class Phone {
   void makePhoneCall() {
       System.out.println("Making a phone call");
   }
   void sendText() {
       System.out.println("Sending text");
   }

    abstract void displayPictures() ;

    abstract void displayPicture();
}
 class Iphone extends Phone{
     @Override
     void displayPictures() {

     }

     @Override
    void displayPicture(){
        System.out.println("Use photo app to display the pic");
    }
   class Samsung extends Phone{

       @Override
       void displayPictures() {
           System.out.println("Get a pic");
       }

       @Override
       void displayPicture() {

       }
   }

}
