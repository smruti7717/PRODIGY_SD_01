import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for temperature value
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        // Prompt user for original unit
        System.out.print("Enter the original unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        // Variables to store converted temperatures
        double celsius = 0, fahrenheit = 0, kelvin = 0;

        // Perform conversions based on input unit
        switch (unit) {
            case 'C': // Celsius
                celsius = temperature;
                fahrenheit = (temperature * 9/5) + 32;
                kelvin = temperature + 273.15;
                break;

            case 'F': // Fahrenheit
                celsius = (temperature - 32) * 5/9;
                fahrenheit = temperature;
                kelvin = (temperature - 32) * 5/9 + 273.15;
                break;

            case 'K': // Kelvin
                celsius = temperature - 273.15;
                fahrenheit = (temperature - 273.15) * 9/5 + 32;
                kelvin = temperature;
                break;

            default:
                System.out.println("Invalid unit. Please enter C, F, or K.");
                scanner.close();
                return;
        }

        // Display results
        System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Temperature in Kelvin: %.2fK%n", kelvin);

        scanner.close();
    }
}
