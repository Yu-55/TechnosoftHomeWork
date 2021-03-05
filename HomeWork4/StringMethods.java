package HomeWork4;

public class StringMethods {
    public static void main(String[] args) {
        String threeWordSentence = "hAppY nEw yeaR";
        String formattedSentence = threeWordSentence.toLowerCase().trim();

        int indOfFirstCharAfterFirstGap = formattedSentence.indexOf(" ") + 1;
        int indOfFirstCharAfterSecondGap = formattedSentence.lastIndexOf(" ") + 1;

        String firstWordInTitleCase = formattedSentence.substring(0, 1).toUpperCase() + formattedSentence.substring(1, indOfFirstCharAfterFirstGap);
        String secondWordInTitleCase = formattedSentence.substring(indOfFirstCharAfterFirstGap, indOfFirstCharAfterFirstGap + 1).toUpperCase()
                + formattedSentence.substring(indOfFirstCharAfterFirstGap + 1, indOfFirstCharAfterSecondGap);
        String thirdWordInTitleCase = formattedSentence.substring(indOfFirstCharAfterSecondGap, indOfFirstCharAfterSecondGap + 1).toUpperCase()
                + formattedSentence.substring(indOfFirstCharAfterSecondGap + 1);
        
        // Checking if there are unnecessary gaps in the sentence
        boolean unnecessaryGaps = formattedSentence.contains("  ");
        String SecWordGapsRemoved = unnecessaryGaps ? secondWordInTitleCase.trim() + " " : secondWordInTitleCase;

        // This output will have middle word in lowercase if the sentence has more than two gaps between first two words
        String formattedSentenceUpdated = firstWordInTitleCase + SecWordGapsRemoved + thirdWordInTitleCase;

        // We need to update the below variables based on formattedSentenceUpdated
        indOfFirstCharAfterSecondGap = formattedSentenceUpdated.lastIndexOf(" ") + 1;

        secondWordInTitleCase = formattedSentenceUpdated.substring(indOfFirstCharAfterFirstGap, indOfFirstCharAfterFirstGap + 1).toUpperCase()
                + formattedSentenceUpdated.substring(indOfFirstCharAfterFirstGap + 1, indOfFirstCharAfterSecondGap);

        formattedSentenceUpdated = firstWordInTitleCase + secondWordInTitleCase + thirdWordInTitleCase;

        System.out.println(formattedSentenceUpdated);

    }
}
