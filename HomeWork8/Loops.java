package HomeWork8;

public class Loops {
    public static void main(String[] args) {

        // Due March 22
        /**
         * task 1:
         * Add all the numbers from given array,
         * and store final result in "total" variable
         */
        double[] doubleArray = {11.23, 43.3, 34, 65.76, 87};
        double total = 0;

        for (int i = 0; i < doubleArray.length; i++) {
            total += doubleArray[i];
        }
        System.out.println("The final result is " + total);


        /**
         * task 2:
         * Find out if the value stored in word variable is palindrome.
         * And, store the result in "isPalindrome" variable
         * palindrome: string which reads the same in reverse
         * eg:
         * level --> level  (palindrome)
         * eye  --> eye     (palindrome)
         * head --> daeh    (not palindrome)
         */
        String word = "lEveL";
        word = word.trim().toLowerCase();
        String[] splitWord = word.split("");
        String normalChars = "";
        String reversedChars = "";

        for (int j = 0; j < splitWord.length; j++) {
            normalChars += splitWord[j];
        }
        for (int j = splitWord.length - 1; j >= 0; j--) {
            reversedChars += splitWord[j];
        }
        boolean isPalindrome = normalChars.equals(reversedChars);
        String resultIsPalindrome = (isPalindrome ? "Yes" : "No");
        System.out.println("The value stored in word variable is palindrome? " + resultIsPalindrome);


        /**
         * task3:
         * Find if the value stored in num variable is a prime number or not.
         * And, store the final result in "isPrime" variable
         * prime number -> number which is ONLY divisible by 1 and itself.
         * eg:
         * 5 -> prime
         * 7 -> prime
         * 10 -> not a prime
         */
        int num = 2;

        boolean isPrime = false;
        if (num <= 1) {
            isPrime = false;
        } else if (num == 2) {
            isPrime = true;
        } else if (num % 2 == 0){
            isPrime = false;
        }else

            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                } else {
                    isPrime = true;
                }
            }
        String result = isPrime ? "is the " : "is not a ";
        System.out.println(num + " " + result + "prime number");
    }
}
