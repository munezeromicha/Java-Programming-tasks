import java.util.*;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList <String>List1 = new ArrayList<>();
        ArrayList <Integer>List2 = new ArrayList<>();

        List1.add("Remy");
        List1.add("Denise");
        List1.add("John");

        List2.add(20);
        List2.add(21);
        List2.add(22);

    for(String name: List1){
        System.out.println("Name: " + name);
    }
    for(int age: List2){
        System.out.println(" age: " +age);
    }
    }
}
//Home assignment