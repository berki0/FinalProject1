import java.util.Scanner;
public class Main {

    public static void startMenu(String[][] allinf,int j) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose what to do (0 - Exit; 1 - List all items; 2 - Add new delivery; 3 - List deliveries for time period)");
        String choice = scanner.nextLine();
        int q = 0;// втори масив

        switch (choice) {
            case "0"://exit
                break;
            case "1":
                listAllItems(allinf,j);
                break;
            case "2":
                j++;
                addNewItem(allinf, j, q);
                break;
            case "3":
                listDeliveriesForTimePeriod();
                break;
            default:
                System.out.println("Invalid Selection");
                System.out.println("Please select again (1-3)");
                startMenu(allinf,j);
        }
    }
    public static String[][] addNewItem(String[][] allInf, int j, int q) {
        Scanner scanner = new Scanner(System.in);
            while (allInf[j][q] == null){
                q=0;
                    System.out.println("Enter product name: ");
                    allInf[j][q] = scanner.nextLine();//product name
                    q += 1;
                    System.out.println("Enter expiry date:");
                    allInf[j][q] = scanner.nextLine();//expiry date
                    q += 1;
                    System.out.println("Enter entry date:: ");
                    allInf[j][q] = scanner.nextLine();//entry date
                    q += 1;
                    System.out.println("Enter manufacturer: ");
                    allInf[j][q] = scanner.nextLine();//manufacturer
                    q += 1;
                    System.out.println("Enter unit: ");
                    allInf[j][q] = scanner.nextLine();//units
                    q += 1;
                    System.out.println("Enter available stock: ");
                    allInf[j][q] = scanner.nextLine();//available stocks
                    q += 1;
                    System.out.println("Enter comment (optional)");
                    allInf[j][q] = scanner.nextLine();//comments
                    System.out.println("Product was added successfully!");
                    System.out.println("Enter size A (as meters 60sm = 0,6 sm): ");
                    double sizeA = scanner.nextDouble();
                    System.out.println("Enter size B (as meters 60sm = 0,6 sm): ");
                    double sizeB = scanner.nextDouble();
                    System.out.println("Enter size C (as meters 60sm = 0,6 sm): ");
                    double sizeC = scanner.nextDouble();
                    double sumSize = sizeA * sizeC * sizeB*Integer.valueOf(allInf[j][6]);
                    System.out.println("Size to m3: " + sumSize);
                    System.out.println("Product was added successfully!");
                    double position = 1.0;
                    position += 1;
                    allInf[j][7] = String.valueOf(position);
                System.out.println();
                break;
        }
        startMenu(allInf,j);
            return allInf;
    }
        public static void listAllItems (String[][]allInf,int j){
            if (allInf[0][0]==null){
                System.out.println("Please enter Products !");
                startMenu(allInf,j);
            }
            j=0;
        while (allInf[j][0] != null){
            int q=0;
                System.out.println("Product name: " + allInf[j][q]);
                q += 1;
                System.out.println("Expiry date: " + allInf[j][q]);
                q += 1;
                System.out.println("Manufacturer: " + allInf[j][q]);
                q += 1;
                System.out.println("Unit: " + allInf[j][q]);
                q += 1;
                System.out.println("Stock: " + allInf[j][q]);
                q += 1;
                System.out.println("Available items at shelf: " + allInf[j][q]);
                q += 1;
                System.out.println("Comment: " + allInf[j][q]);
                q += 1;
                System.out.println("Position: A-" + allInf[j][q]);
            System.out.println();
                j++;
                System.out.println();

        }
        startMenu(allInf,j);
        }
        public static void listDeliveriesForTimePeriod () {
            System.out.println("test");
        }
        public static void main (String[]args){
            String allInformation[][] = new String[20][8];
            int j=-1;
            startMenu(allInformation,j);
        }
    }

//Light bulb - LED 75W |
// Expiry date: n/a |
// Entry date: 05.05.2021 |
// Manufacturer: Philips |
// Unit: Item |
// Stock: 104 |
// Position: A3 / 4 / 10 |
// Available items at shelf: 500 |
// Comment: