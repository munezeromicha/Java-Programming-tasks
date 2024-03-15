import javax.swing.JOptionPane;
import java.util.InputMismatchException;

public class Exercise {

    public static void main(String[] args) {
        int[] numbers = getData();
        double average = calculateAverage(numbers);
        JOptionPane.showMessageDialog(null, "The average of five (5) numbers is: " + average);
    }

    public static int[] getData() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            boolean validInput = false;
            while (!validInput) {
                try {
                    String input = JOptionPane.showInputDialog(null, "Enter number " + (i + 1) + ":");
                    numbers[i] = Integer.parseInt(input);
                    validInput = true;
                } catch (NumberFormatException | InputMismatchException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number!");
                }
            }
        }
        return numbers;
    }

    public static double calculateAverage(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
