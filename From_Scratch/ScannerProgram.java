import java.util.*;
// import java.util.Scanner;
public class ScannerProgram {
    public static void main(String[] args){
        Scanner hold = new Scanner(System.in);

        int num1,num2;
        double num3, num4;
        // String name;

        // System.out.print("Enter Your Username: ");
        // name = hold.toString();
        System.out.println("----------------------------------------------------");
        System.out.println("Addition Calculator:");
        System.out.println("----------------------------------------------------");
        System.out.print("Enter number 1: ");
        num1 = hold.nextInt();
        System.out.print("Enter number 2: ");
        num2 = hold.nextInt();
        System.out.print("Enter number 3: ");
        num3 = hold.nextDouble();
        System.out.print("Enter number 4: ");
        num4 = hold.nextDouble();
        hold.close();
        int sum = num1 + num2;
        System.out.println("The Result equal to: " + sum);
        double summation = num3 + num4;
        System.out.println("The summation will be equal to: "+ summation);

        System.out.println("-------------------- Booleans --------------------");

        boolean T = true;
        boolean F = false;
        
        System.out.println("(T && F) => " + (T&&F));
        System.out.println("(T || F) => " + (T||F));
        System.out.println("!(T || F) => " + !(T || F));
        System.out.println("!(T && F) => " + !(T && F));

        System.out.println("-------------------- End --------------------");

        System.out.println("-------------------- Comparison(Rational) Operators --------------------");
         if(num1 != num2){
            System.out.println("The number" + num1 + " is not equal to number " + num2);
         }else{
            System.out.println("The number " + num1 + " is qual to number " + num2);
         }
         if(num1 > num2){
            System.out.println("The number " + num1 + " is greater than "+ num2);
         }else{
            System.out.println("The number " + num1 + " is less than " + num2);
         }
         if( num1 < num2){
            System.out.println("The number " + num2 + " is greater than " + num1);
         }else{
            System.out.println("The number "+ num2 + " is less than "+ num1);
         }
    }
}
