package HomeWork9;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        /**
         * Write a method to convert given string into Titlecase
         */
        System.out.println(convertToTitlecase("  Hello  "));
        /**
         * Write a method that will tell grade to student for given score and MaxScore
         */
        System.out.println(checkGrade(900, 700));
        /**
         * Write a method that will reverse any given int-array
         */
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(myArray)));
        /**
         * Write a method that return the number of words in given sentence.
         */
        System.out.println(countWords("Hi there !"));


    }

    public static String convertToTitlecase(String stringToConvert) {
        String wordsInTitle = "";
        if (stringToConvert.trim().equals("")) {
            wordsInTitle = stringToConvert;
        } else {
            stringToConvert = stringToConvert.toLowerCase().trim();
            String[] words = stringToConvert.split("\\s+");
            for (String word : words) {
                wordsInTitle += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            }
            wordsInTitle = wordsInTitle.trim();
        }
        return wordsInTitle;
    }

    public static String checkGrade(double score, double maxScore) {

        double percentage = score / maxScore * 100;
        String grade = "";
        if (maxScore < 600 || maxScore > 900) {
            grade = "Please enter valid data: maxScore must be between 600 and 900";
        } else if (score < 1 || score > maxScore) {
            grade = "Please enter valid data: your score must be between 1 and " + maxScore;
        } else if (percentage >= 90.00 && percentage <= 100.00) {
            grade = "Your grade is A";
        } else if (percentage >= 80.00 && percentage <= 89.99) {
            grade = "Your grade is B";
        } else if (percentage >= 70.00 && percentage <= 79.99) {
            grade = "Your grade is C";
        } else if (percentage >= 60.00 && percentage <= 69.99) {
            grade = "Your grade is D";
        } else if (percentage >= 50.00 && percentage <= 59.99) {
            grade = "Your grade is E";
        } else if (percentage <= 50.00) {
            grade = "Your grade is F";
        }
        return grade;
    }

    public static int[] reverseArray(int[] toReverse) {
        int[] reversedArray = new int[toReverse.length];
        for (int i = 0; i < toReverse.length; i++) {
            reversedArray[i] = toReverse[toReverse.length - 1 - i];
        }
        return reversedArray;
    }

    public static int countWords(String string) {
        String[] toArray = string.trim().split("\\s+");
        int counter = 0;
        for (int i = 0; i < toArray.length; i++) {
            if (Character.isLetter(toArray[i].charAt(0))) {
                counter++;
            }
        }
        return counter;
    }
}