import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Scanner scan = new Scanner(System.in);
        JumperInterface jumpInterface = new JumperInterface(scan);
        jumpInterface.start();
    }
}
