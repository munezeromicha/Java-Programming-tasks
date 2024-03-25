public class BetwiseOperators {
    public static void main(String[] args){
        int num1 = 24;
        int num2 =  11;
        int result = 0;

        result = num1 & num2;
        System.out.println("Result: " + result);

        result = num1 | num2;
        System.out.println("Result: " + result);

        result = num1 ^ num2;
        System.out.println("Result: " + result);

        result = ~num1;
        System.out.println("Result: " + result);

        System.out.println("Let's check the right shift: "+(num1 >> 2));
    }
    
}
