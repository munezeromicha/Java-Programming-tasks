import java.util.*;
public class City {
    public static void main(String args[]){
        ArrayList <String> city = new ArrayList<String>();
        city.add("Kigali");
        city.add("Musanze");
        city.add("Nyagatare");
        city.add("Huye");
        city.add("Rubavu");
        city.add("Rusizi");

        Iterator it = city.iterator();
        while(it.hasNext()){
            System.out.println("I live in " + it.next());
        }
     }
}
