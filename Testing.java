import java.util.*;

public class Testing{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        ArrayList<String>names = new ArrayList<>();
        // String names = new String[5];
        String ournames;

        for(int i = 0; i < 5; i++){
            System.out.println("Enter Members name: ");
            ournames = in.nextLine();
            names.add(ournames);
        }
        for(int i = 0; i <5; i++){
            System.out.println("Members name: " + names.get(i));
        }
    }

}
