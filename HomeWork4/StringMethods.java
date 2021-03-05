package HomeWork4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String threeWordSentence = "hAppY nEw yeaR";
        String formattedSentence = threeWordSentence.toLowerCase().trim();

        int indOfFirstCharAfterFirstGap = formattedSentence.indexOf(" ") + 1;
        int indOfFirstCharAfterSecondGap = formattedSentence.lastIndexOf(" ") + 1;

        String FirstWordInTitleCase = formattedSentence.substring(0, 1).toUpperCase() + formattedSentence.substring(1, indOfFirstCharAfterFirstGap); // First word in title case

        String SecondWordInTitleCase = formattedSentence.substring(indOfFirstCharAfterFirstGap, indOfFirstCharAfterFirstGap + 1).toUpperCase()
                + formattedSentence.substring(indOfFirstCharAfterFirstGap + 1, indOfFirstCharAfterSecondGap);                                       // Second word in title case

        String ThirdWordInTitleCase = formattedSentence.substring(indOfFirstCharAfterSecondGap, indOfFirstCharAfterSecondGap + 1).toUpperCase()
                + formattedSentence.substring(indOfFirstCharAfterSecondGap + 1);                                                                    // Third word in title case

        String result = FirstWordInTitleCase + SecondWordInTitleCase + ThirdWordInTitleCase;
        System.out.println(result);


    }
}
