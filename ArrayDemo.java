public class ArrayDemo {
    public static void main(String arg[]){
        int arr [] = new int [5];
        String  Names [] = {"Peter", "Kelly", "Enzo", "Jane", "Jessy"};
        arr[0] = 20;
        arr[1] = 21;
        arr[2] = 22;
        arr[3] = 22;
        arr[4] = 23;
        for (int  i = 0; i < arr.length; i++){
        System.out.println("Name: " + Names[i] + "Age: "+arr[i]);
        }
    }
}
