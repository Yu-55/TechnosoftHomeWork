package HomeWork13;

import java.util.*;

public class HomeWork13 {
    public static void main(String[] args) {
        /**
         * Question 1:
         * Create a method that can find if the given array has any duplicate data or not?
         */

        int[] intArray = {1, 2, 3, 4, 5,};
        String[] stringArray = {"Hi", "bye", "hi"};
        boolean[] boleanArray = {true, false, false};
        char[] charArray = {'1', '3', '5', '4', '4'};
        double[] doubleArray = {34.3, 43.55, 333.4, 4, 3};

        HomeWork13 a = new HomeWork13();
        System.out.println(a.isDataDuplicated(intArray)); // false
        System.out.println(a.isDataDuplicated(stringArray)); // true
        System.out.println(a.isDataDuplicated(boleanArray)); // true
        System.out.println(a.isDataDuplicated(charArray)); // true
        System.out.println(a.isDataDuplicated(doubleArray)); // false

        /**
         * Question 2:
         * Create a method that would return the values occurring more than one time in given string-array
         *
         * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         *
         */
        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        HomeWork13 b = new HomeWork13();
        System.out.println(b.duplicatedWords(words));


        /**
         * Question 3:
         *
         *
         * Create a method that will take String-array as input
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all.
         */
        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green",  "red", "yellow", "yellow", "grey", "blue" , "yellow", "grey",
                "green", "blue",  "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};

        HomeWork13 c = new HomeWork13();
        System.out.println(c.colorMaxCount(arr));

    }


    // Task 1:
    public boolean isDataDuplicated(int[] intArray) {
        Set<Integer> intSet = new HashSet<>();
        for (int number : intArray) {
            intSet.add(number);
        }
        return intSet.size() != intArray.length;
    }

    public boolean isDataDuplicated(String[] stringArray) {

        Set<String> stringSet = new HashSet<>();
        for (String word : stringArray) {
            stringSet.add(word.toLowerCase());
        }
        return stringSet.size() != stringArray.length;
    }

    public boolean isDataDuplicated(double[] doubleArray) {
        Set<Double> doubleSet = new HashSet<>();
        for (double number : doubleArray) {
            doubleSet.add(number);
        }
        return doubleSet.size() != doubleArray.length;
    }

    public boolean isDataDuplicated(char[] charArray) {
        Set<Character> charSet = new HashSet<>();
        for (char onechar : charArray) {
            charSet.add(onechar);
        }
        return charSet.size() != charArray.length;
    }

    public boolean isDataDuplicated(boolean[] booleanArray) {
        Set<Boolean> booleanSet = new HashSet<>();
        for (boolean onevalue : booleanArray) {
            booleanSet.add(onevalue);
        }
        return booleanSet.size() != booleanArray.length;
    }

    // Task 2:

    public String duplicatedWords(String[] words) {
        Set<String> wordsSet = new HashSet<>();
        for (int j = 0; j < words.length; j++) {
            for (int i = j + 1; i < words.length; i++) {
                if (words[j] == words[i]) {
                    wordsSet.add(words[i]);
                }
            }
        }
        String duplicatedWords = "";
        for (String word : wordsSet) {
            duplicatedWords += word + " ";
        }
        return duplicatedWords.trim();
    }

    // Task 3:
    public List<String> colorMaxCount(String[] colors) {
        List<Integer> counter = new ArrayList<>();
        List<String> colorMaxCount = new ArrayList<>();
        if (colors.length <= 1) {
            return Arrays.asList(colors);
        }
        int count = 1;
        for (int j = 0; j < colors.length; j++) {
            for (int i = j + 1; i < colors.length; i++) {
                if (colors[j] == colors[i]) {
                    count++;
                }
                if (i == colors.length - 1) {
                    counter.add(j, count);
                    count = 1;
                }
            }
        }
        int biggestNumber = counter.get(0);
        int indOfBiggestNumber = 0;
        int i;
        for (i = 0; i < counter.size(); i++) {
            if (biggestNumber < counter.get(i)) {
                biggestNumber = counter.get(i);
                indOfBiggestNumber = i;
            }
        }
        colorMaxCount.add(colors[indOfBiggestNumber]);
        for (int f = 0; f < counter.size(); f++) {
            if (biggestNumber == counter.get(f) && f != indOfBiggestNumber) {
                colorMaxCount.add(colors[f]);
            }
        }
        return colorMaxCount;
    }
}
