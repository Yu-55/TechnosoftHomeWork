package HomeWork6;

public class HomeWork6 {
    public static void main(String[] args) {
        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 90.00 - 100.00
         * Grade B: 80.00 - 89.99
         * Grade C: 70.00 - 79.99
         * Grade D: 60.00 - 69.99
         * Grade E: 50.01 - 59.99
         * Grade F: <= 50.00
         */

        double maxScore = 700;
        double studentScore = 600;

        double percentage = studentScore / maxScore * 100;
        percentage = Math.round(percentage * 100.0) / 100.0;

        if (percentage > 100.00 || percentage < 1.00 || maxScore != 700) {
            System.out.println("Please enter valid data");
        } else if (percentage >= 90.00 && percentage <= 100.00) {
            System.out.println("Your percentage is " + percentage + " and your grade is A");
        } else if (percentage >= 80.00 && percentage <= 89.99) {
            System.out.println("Your percentage is " + percentage + " and your grade is B");
        } else if (percentage >= 70.00 && percentage <= 79.99) {
            System.out.println("Your percentage is " + percentage + " and your grade is C");
        } else if (percentage >= 60.00 && percentage <= 69.99) {
            System.out.println("Your percentage is " + percentage + " and your grade is D");
        } else if (percentage >= 50.00 && percentage <= 59.99) {
            System.out.println("Your percentage is " + percentage + " and your grade is E");
        } else if (percentage <= 50.00) {
            System.out.println("Your percentage is " + percentage + " and your grade is F");
        }


        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */
        int number = 15;
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("divisible by both");
        } else if (number % 5 == 0) {
            System.out.println("divisible by 5");
        } else if (number % 3 == 0)
            System.out.println("divisible by 3");
        else
            System.out.println(number);


        /**
         * Checking car gear (P, D, N, R)           // switch
         * if car gear is P, display "you can park the car"
         * if car gear is D,
         * if drive type is Snow, display "You are on Snow mode"
         * if drive type is Sport, display "You are on Sport mode"
         * if drive type is Eco, display "You are on Eco mode"
         * if car gear is N, display "put car in car wash"
         * if car gear is R, display  "revere the car"
         */
        char carGear = 'D';
        String driveType = "Sport";

        switch (carGear) {
            case 'P':
                System.out.println("You can park the car");
                break;
            case 'D':
                switch (driveType) {
                    case "Snow":
                        System.out.println("You are on Snow mode");
                        break;
                    case "Sport":
                        System.out.println("You are on Sport mode");
                        break;
                    case "Eco":
                        System.out.println("You are on Eco mode");
                        break;
                }
                break;
            case 'N':
                System.out.println("put car in car wash");
                break;
            case 'R':
                System.out.println("reverse the car");
        }
    }
}
