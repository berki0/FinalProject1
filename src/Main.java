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
                listAllItems(inf); break;
            case "2":
                int allInf = 0;
                if (inf[0] == null) {
                    String[]allInformation=new String[160];
                    System.out.println("Enter product name: ");
                    allInformation[0] = scanner.next();//product name
                    allInf += 1;
                    System.out.println("Enter expiry date:");
                    allInformation[allInf] = scanner.next();//expiry date
                    allInf += 1;
                    System.out.println("Enter entry date:: ");
                    allInformation[allInf] = scanner.next();//entry date
                    allInf += 1;
                    System.out.println("Enter manufacturer: ");
                    allInformation[allInf] = scanner.next();//manufacturer
                    allInf += 1;
                    System.out.println("Enter unit: ");
                    allInformation[allInf] = scanner.next();//units
                    allInf += 1;
                    System.out.println("Enter available stock: ");
                    allInformation[allInf] = scanner.next();//available stocks
                    allInf += 1;
                    System.out.println("Enter comment (optional)");
                    allInformation[allInf] = scanner.next();//comments
                    allInf += 1;
                    System.out.println("Product was added successfully!");
                    System.out.println("Enter size A: ");
                    int sizeA= scanner.nextInt();
                    System.out.println("Enter size B: ");
                    int sizeB= scanner.nextInt();
                    System.out.println("Enter size C: ");
                    int sizeC= scanner.nextInt();
                    int sumSize=sizeA*sizeC*sizeB;
                    System.out.println("Size to m3: "+sumSize );
                    System.out.println("Product was added successfully!");
                    int position= 1;
                    position+=1;
                    allInformation[allInf]=String.valueOf(position);
                    startMenu(allInformation);
                } else {
                    allInf += 9;
                    String[]allInformation=new String[160];
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
                    System.out.println("Enter size A: ");
                    int sizeA= scanner.nextInt();
                    System.out.println("Enter size B: ");
                    int sizeB= scanner.nextInt();
                    System.out.println("Enter size C: ");
                    int sizeC= scanner.nextInt();
                    int sumSize=sizeA*sizeC*sizeB;
                    int position= 1;
                    position+=1;
                    allInformation[allInf]=String.valueOf(position);
                    allInf+=1;
                    System.out.println("Size to m3: "+sumSize );
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
          int a=0;
    System.out.println("Product name: " + information[a]);
          a+=1;
    System.out.println("Expiry date: " + information[a]);
          a+=1;
    System.out.println("Manufacturer: " + information[a]);
          a+=1;
    System.out.println("Unit: " + information[a]);
          a+=1;
    System.out.println("Stock: " + information[a]);
          a+=1;
    System.out.println("Available items at shelf: " + information[a]);
          a+=1;
    System.out.println("Comment: " + information[a]);
          a+=1;
          System.out.println("Position: " + information[a]);
          a+=1;
          if (information[8]!=null) {
              System.out.println("Product name: " + information[a]);
              a += 1;
              System.out.println("Expiry date: " + information[a]);
              a += 1;
              System.out.println("Manufacturer: " + information[a]);
              a += 1;
              System.out.println("Unit: " + information[a]);
              a += 1;
              System.out.println("Stock: " + information[a]);
              a += 1;
              System.out.println("Available items at shelf: " + information[a]);
              a += 1;
              System.out.println("Comment: " + information[a]);
              a += 1;
              System.out.println("Position: " + information[a]);
              a += 1;
              if (information[16] != null) {
                  System.out.println("Product name: " + information[a]);
                  a += 1;
                  System.out.println("Expiry date: " + information[a]);
                  a += 1;
                  System.out.println("Manufacturer: " + information[a]);
                  a += 1;
                  System.out.println("Unit: " + information[a]);
                  a += 1;
                  System.out.println("Stock: " + information[a]);
                  a += 1;
                  System.out.println("Available items at shelf: " + information[a]);
                  a += 1;
                  System.out.println("Comment: " + information[a]);
                  a += 1;
                  System.out.println("Position: " + information[a]);
                  a += 1;
                  if (information[24] != null) {
                      System.out.println("Product name: " + information[a]);
                      a += 1;
                      System.out.println("Expiry date: " + information[a]);
                      a += 1;
                      System.out.println("Manufacturer: " + information[a]);
                      a += 1;
                      System.out.println("Unit: " + information[a]);
                      a += 1;
                      System.out.println("Stock: " + information[a]);
                      a += 1;
                      System.out.println("Available items at shelf: " + information[a]);
                      a += 1;
                      System.out.println("Comment: " + information[a]);
                      a += 1;
                      System.out.println("Position: " + information[a]);
                      a += 1;
                  }
              }
          }

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
        String allInformation[] = new String[160];
        startMenu(allInformation);

    }
}