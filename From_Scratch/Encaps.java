public class Encaps {
    private int hold = 0;
    public void setHold(int newValue){
        hold  = newValue; // Setter
    }
    public int getHold(){
        return hold;
    }

    public static void main(String[] args){
        Encaps call = new Encaps();
        call.setHold(1000);
        // int number  = call.getHold();

        System.out.println("My number is: "+ (int)call.getHold());
    }
}
