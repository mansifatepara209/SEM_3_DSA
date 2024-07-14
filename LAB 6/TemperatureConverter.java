import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose conversion type:");
        System.out.println("1) Celsius to Fahrenheit");
        System.out.println("2) Fahrenheit to Celsius");
        int choice = sc.nextInt();

        System.out.println("Enter Temperature:");
        double temperature = sc.nextDouble();

        if (choice == 1) {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println("fahrenheit is:" + fahrenheit);
        } else if (choice == 2) {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println("celsius is:" + celsius);
        } else {
            System.out.println("Invalid choice");
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}