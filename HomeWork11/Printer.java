package HomeWork11;

public class Printer {
    private static int paperLevel = 100; // we make it static to share this value among all objects
    private static int tonerLevel = 100; // same
    private final static int maxTonerLevel = 100; // we make it static to
    private final static int maxPaperLevel = 100;

    public static void main(String[] args) {

        Printer p1 = new Printer();
        p1.print(10);
        printerSummary();

        Printer p2 = new Printer();
        p2.print(10, true);
        printerSummary();

        Printer p3 = new Printer();
        p2.print(9, true);
        printerSummary();

        Printer p4 = new Printer();
        p2.print(90);
        printerSummary();

        Printer p5 = new Printer();
        p2.print(10);
        printerSummary();

        addToner(10);
        printerSummary();

        addToner(30);

        addToner(-10);

    }

    public void print(int numberOfPages, boolean doubleSidedPrinting) {
        if (numberOfPages < 0) {
            System.out.println("Please enter valid number of pages");
        } else if (numberOfPages / 2 > paperLevel || numberOfPages > tonerLevel) {
            System.out.println("Not enough paper or toner");
        } else if (numberOfPages % 2 != 0) {
            paperLevel -= numberOfPages / 2 + 1; // or Math.ceil(numberOfPages / 2)
            tonerLevel -= numberOfPages;
        } else {
            paperLevel -= numberOfPages / 2;
            tonerLevel -= numberOfPages;
        }
    }

    public void print(int numberOfPages) {
        if (numberOfPages < 0) {
            System.out.println("Please enter valid number of pages");
        } else if (numberOfPages > paperLevel || numberOfPages > tonerLevel) {
            System.out.println("Not enough paper or toner");
        } else {
            paperLevel -= numberOfPages;
            tonerLevel -= numberOfPages;
        }
    }

    public static void addToner(int addToner) {
        if (addToner < 0 || addToner > maxTonerLevel - tonerLevel) {
            System.out.println("Invalid toner value");
        } else {
            tonerLevel += addToner;
        }
    }

    public static void addPaper(int addPaper) {
        if (addPaper < 0 || addPaper > maxPaperLevel - paperLevel) {
            System.out.println("Invalid paper value");
        } else {
            paperLevel += addPaper;
        }
    }

    public static void printerSummary() {
        System.out.println("Toner level: " + tonerLevel +
                "\n" + "Paper level: " + paperLevel);
    }
}
