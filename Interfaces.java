/**
 * Interfaces
 */
interface Interfaces {
   public void add(int a, int b);
   public void multiply(float a, int b);
}

interface InheritInterface{
    void getData(String Fn);
}
public class ImplementInt implements InterfaceDemo, InheritInterface{
    String name;
    public void add(int a, int b){
        return a+b;
    }
    public void multiply(float a, int b){
        return a*b;
    }
    public void getData(String Fn){
        name = Fn;
        System.out.println("My Name is: " + name+"\n I  like java\n-------------");
    }
    public static void main(String[] args){
        ImplementInt im = new ImplementInt();
        im.getData("Peter");
        System.out.println("Sum:" + im.add(12,15));
        System.out.println("Product: " + im.multiply(12.5,8));
    }
}
