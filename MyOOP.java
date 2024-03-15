import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class MyOOP {
    public ArrayList<String> getData() {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter 5 names:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Name " + (i+1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }
        scanner.close();
        
        return names;
    }
}

class Bonus {
    public void display(ArrayList<String> names) {
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Welcome " + name + "!");
            System.out.println("--------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyOOP myOOP = new MyOOP();
        ArrayList<String> names = myOOP.getData();
        
        Bonus bonus = new Bonus();
        bonus.display(names);
    }
}
