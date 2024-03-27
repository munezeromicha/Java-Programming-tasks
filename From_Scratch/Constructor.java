public class Constructor {
    String name;
    int regno;

    Constructor(String username, int refno){
        this.name = username;
        this.regno = refno;

        System.out.println("Your name is: " + this.name + " and your regNo is: " + this.regno);
    }
    public static void main(String[] args){
        Constructor obj1 = new Constructor("John", 222);
    }
}
