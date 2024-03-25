public class ControlFlow {

    public void controlStatement(){
        int number = 100;

        if(number < 150){
            System.out.println("The number "+ number + " is less than 150.");
            if (number == 100) {
                System.out.println("This is nested if where the number "+ number + " is also equal to 100." );
            }
        }
    }

    public void ifElse(){
        int age = 15;

        if (age >= 18) {
            System.out.println("You are allowed to vote!");
        }else{
            System.out.println("You are not allowed to vote");
        }
    }
    public void ifElseIf(){
        int range = 11200;

        if(range < 10 && range >= 1){
            System.out.println("Its a two digits number!");
        }else if(range < 100 && range >= 10){
            System.out.println("Its a three digits number!");
        }else if(range < 1000 && range >= 100){
            System.out.println("Its a four digits number!");
        }else if(range < 10000 && range >= 1000){
            System.out.println("Its a five digit number!");
        }else if( range < 15000 && range >= 10000){
            System.out.println("Its also five digits number!");
        }
    }
    public static void main(String[] args){
        ControlFlow flow = new ControlFlow();

        flow.controlStatement();
        flow.ifElse();
        flow.ifElseIf();
    }

}
