
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
        printWithSmileys("\\:D/");
printWithSmileys("87.");
    }

    private static void printWithSmileys(String characterString) {
        String modified = characterString;
        if (characterString.length() % 2 == 1) {
            modified += " ";
        }
        modified = ":) " + modified + " :)";
        printSmileyLine(modified);
        System.out.println(modified);
        printSmileyLine(modified);
    }
    
    private static void printSmileyLine(String characterString) {
        int numOfSmileys = characterString.length() / 2;
        for (int i = 0; i < numOfSmileys; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }
}
