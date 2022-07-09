import java.util.Scanner;

public class Main {
    public static void startMenu(String[]inf) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose what to do (0 - Exit; 1 - List all items; 2 - Add new delivery; 3 - List deliveries for time period)");
        String choice = scanner.nextLine();
        switch (choice) {
            case "0":
                break;
            case "1":
                listAllItems(inf);
                break;
            case "2":

                int allInf = 0;
                if (inf[0] == null) {
                    String[]allInformation=new String[171];
                    System.out.println("Enter product name: ");
                    allInformation[0] = scanner.next();
                    allInf += 1;
                    System.out.println("Enter expiry date:");
                    allInformation[allInf] = scanner.next();
                    allInf += 1;
                    System.out.println("Enter entry date:: ");
                    allInformation[allInf] = scanner.next();
                    allInf += 1;
                    System.out.println("Enter manufacturer: ");
                    allInformation[allInf] = scanner.next();
                    allInf += 1;
                    System.out.println("Enter unit: ");
                    allInformation[allInf] = scanner.next();
                    allInf += 1;
                    System.out.println("Enter available stock: ");
                    allInf += 1;
                    allInformation[allInf] = scanner.next();
                    System.out.println("Enter comment (optional)");
                    allInf += 1;
                    allInformation[allInf] = scanner.next();
                    allInf += 1;
                    System.out.println("Product was added successfully!");

                    startMenu(allInformation);
                } else {
                    allInf += 9;
                    String[]allInformation=new String[171];
                    System.out.println("Enter product name: ");
                    allInformation[0] = scanner.next();
                    allInf += 1;
                    System.out.println("Enter expiry date:");
                    allInformation[allInf] = scanner.next();
                    allInf += 1;
                    System.out.println("Enter entry date:: ");
                    allInformation[allInf] = scanner.next();
                    allInf += 1;
                    System.out.println("Enter manufacturer: ");
                    allInformation[allInf] = scanner.next();
                    allInf += 1;
                    System.out.println("Enter unit: ");
                    allInformation[allInf] = scanner.next();
                    allInf += 1;
                    System.out.println("Enter available stock: ");
                    allInf += 1;
                    allInformation[allInf] = scanner.next();
                    System.out.println("Enter comment (optional)");
                    allInf += 1;
                    allInformation[allInf] = scanner.next();
                    allInf += 1;
                    System.out.println("Product was added successfully!");
                    startMenu(allInformation);
                }
                break;
            case "3":
                listDeliveriesForTimePeriod();
                break;
            default:
                System.out.println("Invalid Selection");
                System.out.println("Please select again (1-3)");
                startMenu(inf);
        }
    }
    public static void listAllItems(String[]information) {
      if (information[0]!=null) {
    System.out.println("Product name: " + information[0]);
    System.out.println("Expiry date: " + information[1]);
    System.out.println("Manufacturer: " + information[2]);
    System.out.println("Unit: " + information[3]);
    System.out.println("Stock: " + information[4]);
    System.out.println("Position: " + information[5]);
    System.out.println("Available items at shelf: " + information[6]);
    System.out.println("Comment: " + information[7]);
    startMenu(information);
       }else{
          System.out.println("Please enter products");
          startMenu(information);
      }
    }
    public static void listDeliveriesForTimePeriod() {
        System.out.println("test");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allInformation[] = new String[171];
        startMenu(allInformation);

    }
}