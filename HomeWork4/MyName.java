package HomeWork4;

public class MyName {
    public static void main(String[] args) {
        String fullName = "Yury Kutovoy";
        int nameLength = fullName.length();
        System.out.println("The length of my full name is: " + nameLength + " characters");

        String startsWith = fullName.toLowerCase().startsWith("k") ? "Yes" : "No";
        System.out.println("Does my name start with 'k'? " + startsWith);


        String contains = fullName.toLowerCase().contains("a") ? "Yes" : "No";
        System.out.println("Does my full name contain 'a'? " + contains);
    }
}
