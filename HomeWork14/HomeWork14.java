package HomeWork14;

import java.util.*;

public class HomeWork14 {

    public static void main(String[] args) {


        /**
         * Question 1:
         * Create a method, that will return all duplicates values with count from the given List<String>
         * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         * Output:
         *      happy - 2
         *      joy - 3
         *      laugh - 2
         */

        String[] wordsArray = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        List<String> words = Arrays.asList(wordsArray);

        HomeWork14 a = new HomeWork14();
        System.out.println(a.numberDuplicatedValues(words));

        /**
         *
         * Question 2:
         * Create a hashMap with any numbers of key-value pairs from the user
         * Key should be Integer
         * Value should be String
         *
         * Create method that will print the keys with same value, else "All keys have different values"
         *
         * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
         * Output (print) ->
         *      "happy" with keys -> 101, 103, 106
         *      "peace" with keys -> 102, 105
         *
         * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
         * Output (print) ->
         *      All keys have different values
         *
         *
         */
        HashMap<Integer, String> input = new HashMap<>();

        input.put(101, "happy");
        input.put(102, "peace");
        input.put(103, "Happy");
        input.put(104, "learn");
        input.put(105, "PEaCe");
        input.put(106, "HAPPY");

//        input.put(111, "happy");
//        input.put(98, "peace");
//        input.put(10, "LAugh");
//        input.put(55, "learn");
//        input.put(109, "Grow");

        HomeWork14 b = new HomeWork14();
        System.out.println(b.sameValueKeys(input));
        /**
         * Question 3:
         * Create a method that will take String-array as input
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all.
         */
        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};
        HomeWork14 c = new HomeWork14();
        System.out.println(c.colorMaxCount(arr));

    }

    public Map<String, Integer> numberDuplicatedValues(List<String> checkValues) {
        Map<String, Integer> numberDuplicatedValues = new HashMap<>();
        int count = 1;
        for (int j = 0; j < checkValues.size(); j++) {
            for (int i = j + 1; i < checkValues.size(); i++) {
                if (checkValues.get(j).equalsIgnoreCase(checkValues.get(i))) {
                    count++;
                }
            }
            if (count > 1 && !numberDuplicatedValues.containsKey(checkValues.get(j))) {
                numberDuplicatedValues.put(checkValues.get(j), count);
            }
            count = 1;
        }
        return numberDuplicatedValues;
    }


    public Map<String, List<Integer>> sameValueKeys(HashMap<Integer, String> input) {

        List<String> listOfValues = new ArrayList<>(input.values());
        List<String> listOfDuplicatedValues = new ArrayList<>();
        Map<String, List<Integer>> output = new HashMap<>();

        for (int j = 0; j < input.size(); j++) {
            for (int i = j + 1; i < input.size(); i++) {
                if (listOfValues.get(j).equalsIgnoreCase(listOfValues.get(i)) && !listOfDuplicatedValues.contains(listOfValues.get(j).toLowerCase())) {
                    listOfDuplicatedValues.add(listOfValues.get(j).toLowerCase());
                }
            }
        }
        if (listOfDuplicatedValues.size() == 0) {
            System.out.println("All keys have different values");
            return output;
        }
        List<Integer> keyList = new ArrayList<>();
        for (int e = 0; e < listOfDuplicatedValues.size(); e++) {
            for (Integer key : input.keySet()) {
                if (input.get(key).equalsIgnoreCase(listOfDuplicatedValues.get(e))) {
                    keyList.add(key);
                }
                output.put(listOfDuplicatedValues.get(e) + " with keys ", keyList);
            }
            keyList = new ArrayList<>();
        }
        return output;
    }


    public List<String> colorMaxCount(String[] arr) {

        Map<String, Integer> colorsWithCount = new HashMap<>();
        int count = 1;
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[j].equalsIgnoreCase(arr[i])) {
                    count++;
                }
            }
            if (!colorsWithCount.containsKey(arr[j])) {
                colorsWithCount.put(arr[j], count);
                count = 1;
            }
        }
        List<String> colorMaxCount = new ArrayList<>();
        int tempMaxVal = 1;
        for (String color : colorsWithCount.keySet()) {
            if (colorsWithCount.get(color) > tempMaxVal) {
                tempMaxVal = colorsWithCount.get(color);
            }
        }
        for (String color : colorsWithCount.keySet()) {
            if (colorsWithCount.get(color) >= tempMaxVal) {
                colorMaxCount.add(color);
            }
        }
        return colorMaxCount;
    }
}
