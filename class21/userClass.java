package class21;

public class userClass {

    String name;
    String mobileNumber;

    public userClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    void printInfo(){

        System.out.println(name+" "+mobileNumber);
    }
}

class userInfo extends userClass {
    String address;
    public userInfo(String name, String mobileNumber) {super(name, mobileNumber);}
    public userInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);

        this.address = address;
    }
    void userDetails(){
        System.out.println(name+" "+mobileNumber+" "+address);
    }
    static class TesterUser{

        public  static void main(String[] args) {
            userInfo you=new userInfo("Cece","571-222-4545","5500 Columbia Pike,Arlington VA 22302");
            you.userDetails();
        }
    }
}