import java.util.Scanner;

public class Ex4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] numbers = new int[10];
            System.out.println("Enter 10 integers:");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextInt();
            }
            System.out.println("Array in reverse order:");
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

