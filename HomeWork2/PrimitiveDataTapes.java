package HomeWork2;

public class PrimitiveDataTapes {

    public static void main(String[] args) {
        byte hoursInDay = 24;
        System.out.println("Number of hours in a day is " + hoursInDay);
        short maxDaysInYear = 366;
        System.out.println("Max number of days in an year is " + maxDaysInYear);
        int numbersOfEmployees = 135_000; // number of Google's employees
        System.out.println("Total number of employees in an organization is " + numbersOfEmployees);
        int usPopulation = 331_000_000;
        System.out.println("The population in a country is " + usPopulation);
        float interestRate = 1.5f;
        System.out.println("Interest rate is " + interestRate);
        int bankAccountBalance = 200_000;
        System.out.println("Balance in a bank account is " + bankAccountBalance);
        boolean isSunRiseFromWest = false;
//      String result = isSunRiseFromWest ? "Yes" : "No";
        System.out.println("Does the sun rise from the west? " + isSunRiseFromWest);
        char myFirstInitial = 'Y', mySecondInitial = 'K';
        System.out.println("Initials of my name is " + myFirstInitial + mySecondInitial);
    }
}
