
import java.util.Scanner;
public class count {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        int vowelCount = countVowels(userInput);
        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();

    }


            public static int countVowels(String text) {
                int count = 0;
                text = text.toLowerCase();

                for (int i = 1; i < text.length(); i++) {
                    char ch = text.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        count++;
                    }
                }

                return count;
            }


        }





