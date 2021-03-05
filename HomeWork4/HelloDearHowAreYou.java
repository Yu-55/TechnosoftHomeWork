package HomeWork4;

public class HelloDearHowAreYou {
    public static void main(String[] args) {

        String sentence_3 = "hello dear, how are you?";
        int length = sentence_3.length();
        String result = length > 10? "true": "false";
        System.out.println(sentence_3 + " " + result);
    }
}
