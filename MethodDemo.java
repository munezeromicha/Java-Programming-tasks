import java.util.Scanner;
public class MethodDemo {
static int a,b,c;
public static void getNumbers(int x, int y){
    
    Scanner var = new Scanner(System.in);
    System.out.print("Enter Number 1: ");
    x = var.nextInt();
    System.out.print("Enter Number 2:");
    y = var.nextInt();
    a =x;
    b =y;
}
public static int displayResult(){
    if(a>b){
        System.out.println("Greatest Number is: "+ a);
    }else{
        System.out.println("Greatest Number is: "+ b);
    }
    return 0;
}
public static void main(String args[]){
    getNumbers(0,0);
    displayResult();
}
}