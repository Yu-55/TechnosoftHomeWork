package HomeWork5;

public class IfStatement {
    public static void main(String[] args) {

        /**
         * String fullName = "happy";
         * 1. Does first name start with 'K' (ignore cases)
         * 2. If user has a last name, Does last name ends with 'a' (ignore cases)
         *      else print, "No last name entered"
         * 3. If user has a last name, print the 1st letter of last name
         *      else print, "No last name entered"
         * 4. Print the number of letters in the first name.
         */
        String fullName = "happy";
        fullName = fullName.toLowerCase().trim();
        String firstLetterK = fullName.startsWith("k") ? "Yes" : "No";
        System.out.println("The first name starts with 'K'? " + firstLetterK);
        int secondNameBegins = fullName.lastIndexOf(" ") + 1;

        if (fullName.contains(" ") && fullName.endsWith("a")) {
            System.out.println("User's last name is: " + fullName.substring(secondNameBegins));
        } else
            System.out.println("No last name entered");

        if (fullName.contains(" ")) {
            System.out.println("The first letter of the last name is: " + fullName.charAt(secondNameBegins));
        } else
            System.out.println("No last name entered");


        /**
         * String threeWordsSentence_1 =  "hApPY nEW yeAr";
         * sout(threeWordsSentence_1);  // hApPY nEW yeAr
         * // code
         * sout(threeWordsSentence_1);  // Happy New Year
         */

        String threeWordsSentence_1 = "hAppY nEw yeaR";
        String formattedSentence = threeWordsSentence_1.toLowerCase().trim();
        String[] words = formattedSentence.split(" ");


        String word1 = words[0].substring(0, 1).toUpperCase() + words[0].substring(1);
        String word2 = words[1].substring(0, 1).toUpperCase() + words[1].substring(1);
        String word3 = words[2].substring(0, 1).toUpperCase() + words[2].substring(1);
        threeWordsSentence_1 = word1 + " " + word2 + " " + word3;

        System.out.println(threeWordsSentence_1);

/**
 * Create abbreviation:
 * String threeWordsSentence_2 =  "Lab sessIONS clAsses";
 * // code
 * LSC
 *
 */
        String threeWordsSentence_2 = "Lab sessIONS clAsses";
        String formattedSentence2 = threeWordsSentence_2.toUpperCase().trim();

        int indOfFirstGap = formattedSentence2.indexOf(" ");

        String abbreviation1 = formattedSentence2.substring(0, 1);
        String abbreviation3 = formattedSentence2.substring(formattedSentence2.lastIndexOf(" ") + 1,
                formattedSentence2.lastIndexOf(" ") + 2);
        formattedSentence2 = formattedSentence2.replaceAll("  ", "");
        String abbreviation2 = formattedSentence2.substring(formattedSentence2.indexOf(" ") + 1,
                formattedSentence2.indexOf(" ") + 2);
        if (formattedSentence2.charAt(indOfFirstGap) != ' ') {

            char abbreviation22 = formattedSentence2.charAt(indOfFirstGap);

            System.out.println("The abbreviation of: '" + threeWordsSentence_2 + " is " + abbreviation1 + abbreviation22 + abbreviation3);
        } else
            System.out.println("The abbreviation of: '" + threeWordsSentence_2 + " is " + abbreviation1 + abbreviation2 + abbreviation3);


        /**
         * String sentence_4 = "We all are here to learn good stuff";
         * Print the number of words in the sentence.
         *
         */

        String sentence_4 = "We all    are here to learn good stuff";
        String[] words_4 = sentence_4.split(" ");
        words_4 = sentence_4.split("\\s+");
        int numberOfWords = words_4.length;
        System.out.println("Number of words in the sentence is " + numberOfWords);


    }
}
