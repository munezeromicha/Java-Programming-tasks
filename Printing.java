import java.util.*;
public class Printing {
    public static void main(String args[]){
        ArrayList <Integer>number = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int holding;
        for(int i = 0; i < number.size(); i++) {
            System.out.println("Inter the number on the list:");
            holding = in.nextInt(i);
            number.add(holding);
        }
        for(int j = 0;  j<number.size(); j++){
            System.out.println("Outputs: "+ number.get(j));
        }
    }

}
