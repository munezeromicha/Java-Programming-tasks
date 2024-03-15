import java.util.*;
public class ScannerClass {
    static String Fname,Lname; 
    static int a,b;

    public static void main(String args[]){
 int v;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Name: ");
        Fname = sc.next();
        System.out.print("Enter Last Name: ");
        Lname = sc.next();
        System.out.print("Enter Number 1: ");
        a = sc.nextInt();
        System.out.print("Enter Number 1: ");
        b = sc.nextInt();
      System.out.println("enter your location: ");
       v = sc.nextInt();
        int c; 
         if(a == b) {
            c = a * b;
            System.out.print("Hello" + Fname + " " + Lname);
            System.out.println("Square = " + c); 
         }else{
            c = a + b;
            System.out.println("Hello" + Fname);
            System.out.println("Sum of "+a+" and "+b+" is = " + c); 
         }
    }
}