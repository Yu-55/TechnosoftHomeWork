package HomeWork3;

public class ConversionOfTemperature {
    public static void main(String[] args) {
        // Celsius to Fahrenheit conversion T(°F) = T(°C) × 9/5 + 32
        double tempC = 10;
        double tempF = tempC * 9 / 5 + 32;
        System.out.println(tempC + "°C --> " + tempF + "°F");

        // Celsius to Kelvin conversion T(K) = T(°C) + 273.15
        tempC = 10;
        double tempK = tempC + 273.15;
        System.out.println(tempC + "°C --> " + tempK + "K");

        // Fahrenheit to Celsius conversion T(°C) = (T(°F) - 32) × 5/9
        tempF = 20;
        tempC = (tempF - 32) * 5 / 9;
        System.out.println(tempF + "°F --> " + tempC + "°C");

        // Fahrenheit to Kelvin conversion T(K) = (T(°F) + 459.67)× 5/9
        tempF = 20;
        tempK = (tempF + 459.67) * 5 / 9;
        System.out.println(tempF + "°F --> " + tempK + "K");

        // Kelvin to Fahrenheit conversion T(°F) = T(K) × 9/5 - 459.67
        tempK = 30;
        tempF = tempK * 9 / 5 - 459.67;
        System.out.println(tempK + "K --> " + tempF + "°F");

        // Kelvin to Celsius conversion T(°C) = T(K) - 273.15
        tempK = 30;
        tempC = tempK - 273.15;
        System.out.println(tempK + "K --> " + tempC + "°C");


    }
}
