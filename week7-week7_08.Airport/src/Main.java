import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        start();
    }
    
    public static void start() {
        Scanner scan = new Scanner(System.in);
        Airport airport = new Airport();
        System.out.println("Airport panel");
        System.out.println("--------------------");
        
        while (true) {
            System.out.println("Choose operation");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String command = scan.nextLine();
            if (command.equals("x")) {
                System.out.println("");
                break;
            }
            
            if (command.equals("1")) {
                System.out.print("Give plane ID: ");
                String id = scan.nextLine();
                System.out.print("Give plane capacity: ");
                int capacity = Integer.parseInt(scan.nextLine());
                airport.addPlane(id, capacity);
            } else if (command.equals("2")) {
                System.out.print("Give plane ID: ");
                String id = scan.nextLine();
                System.out.print("Give departure airport code: ");
                String departure = scan.nextLine();
                System.out.print("Give destination airport code: ");
                String destination = scan.nextLine();
                airport.addFlight(id, departure, destination);
            }
        }
        
            System.out.println("Flight service");
            System.out.println("------------");
            System.out.println();
                       
        while (true) {
            System.out.println("Choose operation: ");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String command = scan.nextLine();
            
            if (command.equals("x")) {
                System.out.println();
                break;
            }
            
            if (command.equals("1")) {
                airport.printPlanes();
            } else if (command.equals("2")) {
                airport.printFlights();
            } else if (command.equals("3")) {
                System.out.print("Give plane ID: ");
                String planeId = scan.nextLine();
                airport.printPlane(planeId);
            }
            System.out.println();
        }
    }
    
//    public void airportPanel(Scanner scan) {
//        System.out.println("Airport panel");
//        System.out.println("--------------------");
//        
//        while (true) {
//            System.out.println("Choose operation");
//            System.out.println("[1] Add airplane");
//            System.out.println("[2] Add flight");
//            System.out.println("[x] Exit");
//            System.out.print("> ");
//            String command = scan.nextLine();
//            if (command.equals("x")) {
//                break;
//            }
//            
//            if (command.equals("1")) {
//                
//            }
//        }
//    }
//    
//    public void flightService() {
//        
//    }
}
