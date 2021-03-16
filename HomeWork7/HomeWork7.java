package HomeWork7;

public class HomeWork7 {
    public static void main(String[] args) {

        /**
         * String sentence1 =  "hApPY nEW yeAr";
         * sout(sentence1);  // hApPY nEW yeAr
         * // code
         * sout(sentence1);  // Happy New Year
         */

        String sentence1 = "hAppY nEw yeaR";
        System.out.println(sentence1);

        sentence1 = sentence1.toLowerCase().trim();
        String[] words = sentence1.split("\\s+");
        String gatheringWords = "";
        for (String word : words) {
            gatheringWords += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }
        sentence1 = gatheringWords;
        System.out.println(sentence1);

        /**
         * Create abbreviation:
         * String sentence2 =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */

        String sentence2 = "Lab sessIONS clAsses";
        String[] words2 = sentence2.split("\\s+");
        for (String word1 : words2) {
            System.out.print(word1.substring(0, 1).toUpperCase());
        }
        System.out.print("\n");


        /**
         * Reverse a string
         *
         */
        String sentence3 = "happy holidays";
        String reverseSentence3 = "";
        String[] letters = sentence3.split("");
        System.out.println("sentence3 : " + sentence3);     // happy holidays
        // code
        for (int i = sentence3.length() - 1; i >= 0; i--) {
            reverseSentence3 += letters[i];
        }
        System.out.println("Reverse sentence3 : " + reverseSentence3);  // syadiloh yppah
    }
}
