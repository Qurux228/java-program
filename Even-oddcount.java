
import java.util.Scanner;

public class Exi5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numbers = new int[6];
            int evenCount = 0;
            int oddCount = 0;


            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter integer " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }
            for (int num : numbers) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }


            System.out.println("Number of even numbers: " + evenCount);
            System.out.println("Number of odd numbers: " + oddCount);

            scanner.close();
        }
    }

