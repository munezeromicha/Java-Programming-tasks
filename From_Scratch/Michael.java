public class Michael extends InheritancePerson{
     String myName = "MUNEZERO NTAGANIRA Michael";

    public static void main(String[] args){
        Michael mySelf = new Michael();
        Michael obj2 = new Michael();
        
        System.out.println("Michael can Speak: " + mySelf.Speak);
        System.out.println("Michael can: " + mySelf.Move);
        System.out.println("Michael can eat: " + mySelf.Eat);
        // mySelf.humanBeing();
        obj2.humanBeing();
    }
}