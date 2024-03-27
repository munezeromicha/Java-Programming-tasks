public class Encapsulation {
    private int myCar = 0;

    public void setCar(int car){
        myCar = car;
    }
    public int getCar(){
        return myCar;
    }
    public static void main(String[] args){
        Encapsulation call = new Encapsulation();
        call.setCar(100);
        // int number  = call.getCar();
        // System.out.println("My Cars are equals to :" + number); // all the ways for getting output are working!

        System.out.println("All of my Cars are equals to :" + (int)call.getCar()); // all the ways for getting output
    }
}
