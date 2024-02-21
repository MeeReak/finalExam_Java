import java.util.Scanner;

public class inputListNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of numbers you want to input: ");
        int numNumbers = scanner.nextInt();

        int[] numbers = new int[numNumbers];

        for (int i = 0; i < numNumbers; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("You entered the following numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
        scanner.close();
    }
}