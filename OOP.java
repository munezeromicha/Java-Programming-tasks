// -------------------------
// Pillars of OOP:
//- Encapsulation
//- Abstraction
//- Inheritance
//- Polymorphism
// -------------------------
public class OOP {
    private int Id;
    private String Fname;
    private String Level;

    public OOP(){
        Id=2024001;
        Fname = "Peter";
        Level = "Year 2 CS";
    }
    public void display(){
        System.out.println("Name: " + Fname+", Level:"+ Level);
    }
}
 public class MainClass{
    public static void main(String args[]){
        OOP mine = new OOP();
        mine.display();
    }
}
