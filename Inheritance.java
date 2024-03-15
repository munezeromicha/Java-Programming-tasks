//- Inheritance: One class inherits the properties of the other class 
//- We use keyword extends to make inheritance
//- Java support single inheritance with classes and multiple inheritance with interfaces

//---------------------------------
// Example of inheritance
//---------------------------------


import java.util.Scanner;
public class Inheritance {
    protected int a;
    public Inheritance(){
        Scanner s = new Scanner(System.in);
        a= s.nextInt();
    }
}
class Display extends Inheritance{
    public void  show(){
        int sq = a*a;
        System.out.println(("Square: " + sq));
    }
    public static void main(String args[]){
        Display d = new Display();
        d.show();
    }
}
