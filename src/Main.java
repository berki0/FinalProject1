import java.util.Scanner;

public class Main {
    public static void startMenu() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please choose what to do (0 - Exit; 1 - List all items; 2 - Add new delivery; 3 - List deliveries for time period)");
        int choice= scanner.nextInt();
        switch (choice){
            case 0:break;
            case 1:
                listAllItems();break;
            case 2:
                addNewDelivery();break;
            case 3:
                listDeliveriesForTimePeriod();break;
            default:
                System.out.println("Invalid Selection");
                System.out.println("Please select again (1-3)");
                startMenu();
        }
    }
    public static void listAllItems(){
        System.out.println("test");
    }
    public static void addNewDelivery(){
        Scanner scanner=new Scanner(System.in);
        String nameProduct[]=new String[19];
        String expiryDate[]=new String[19];
        String dateОfАrrival[]=new String[19];
        String manufacturer[]=new String[19];
        int unit[]=new int[19];
        int availableQuantity[]=new int[19];
        String location[]=new String[19];
        String availabeItemAtShelf[]=new String[19];
        String coment[]=new String[19];
        int numberProduct=0;
        System.out.println("Enter product name: ");
        nameProduct[numberProduct]=scanner.next();
        System.out.println("Enter expiry date:");
        expiryDate[numberProduct]= scanner.next();
        System.out.println("Enter entry date:: ");
        dateОfАrrival[numberProduct]= scanner.next();
        System.out.println("Enter manufacturer: ");
        manufacturer[numberProduct]= scanner.next();
        System.out.println("Enter unit: ");
        unit[numberProduct]= scanner.nextInt();
        System.out.println("Enter available stock: ");
        availableQuantity[numberProduct]= scanner.nextInt();
        System.out.println("Enter comment (optional)");
        coment[numberProduct]= scanner.next();
        System.out.println("Product was added successfully!");
        numberProduct+=1;
        startMenu();
    }
    public static void listDeliveriesForTimePeriod(){
        System.out.println("test");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        startMenu();
    }
}