
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        double celsius = convertToCelsius(f);
        System.out.println("Temperature in Celsius: " + celsius);
    }
        public static double convertToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }


    }

