import java.util.Scanner;
public class Main {
    
    public static void startMenu(String[][]inf) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose what to do (0 - Exit; 1 - List all items; 2 - Add new delivery; 3 - List deliveries for time period)");
        String choice = scanner.nextLine();
        switch (choice) {
            case "0":
                break;
            case "1":
                listAllItems(inf); break;
            case "2":
                int o = 0;
                if (inf[0][0] == null) {
                    System.out.println("Enter product name: ");
                    inf[0][o] = scanner.next();//product name
                    o += 1;
                    System.out.println("Enter expiry date:");
                    inf[0][o] = scanner.next();//expiry date
                    o += 1;
                    System.out.println("Enter entry date:: ");
                    inf[0][o] = scanner.next();//entry date
                    o += 1;
                    System.out.println("Enter manufacturer: ");
                    inf[0][o] = scanner.next();//manufacturer
                    o += 1;
                    System.out.println("Enter unit: ");
                    inf[0][o] = scanner.next();//units
                    o += 1;
                    System.out.println("Enter available stock: ");
                    inf[0][o] = scanner.next();//available stocks
                    o += 1;
                    System.out.println("Enter comment (optional)");
                    inf[0][o] = scanner.next();//comments
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
                    inf[0][7]=String.valueOf(position);
                    startMenu(inf);
                }else if (inf[1][0]==null ){
                    int j=1;
                    System.out.println("Enter product name: ");
                inf[j][o] = scanner.next();
                o += 1;
                System.out.println("Enter expiry date:");
                inf[j][o] = scanner.next();
                o += 1;
                System.out.println("Enter entry date:: ");
                inf[j][o] = scanner.next();
                o += 1;
                System.out.println("Enter manufacturer: ");
                inf[j][o] = scanner.next();
                o += 1;
                System.out.println("Enter unit: ");
                inf[j][o] = scanner.next();
                o += 1;
                System.out.println("Enter available stock: ");
                inf[j][o] = scanner.next();
                o += 1;
                System.out.println("Enter comment (optional)");
                inf[j][o] = scanner.next();
                System.out.println("Enter size A: ");
                int sizeA= scanner.nextInt();
                System.out.println("Enter size B: ");
                int sizeB= scanner.nextInt();
                System.out.println("Enter size C: ");
                int sizeC= scanner.nextInt();
                int sumSize=sizeA*sizeC*sizeB;
                int position= 1;
                position+=1;
                inf[j][7]=String.valueOf(position);
                System.out.println("Size to m3: "+sumSize );
                System.out.println("Product was added successfully!");
                startMenu(inf);
            }else if (inf[2][0]==null ){
                    int j=2;
                    o=0;
                    System.out.println("Enter product name: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter expiry date:");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter entry date:: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter manufacturer: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter unit: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter available stock: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter comment (optional)");
                    inf[j][o] = scanner.next();
                    System.out.println("Enter size A: ");
                    int sizeA= scanner.nextInt();
                    System.out.println("Enter size B: ");
                    int sizeB= scanner.nextInt();
                    System.out.println("Enter size C: ");
                    int sizeC= scanner.nextInt();
                    int sumSize=sizeA*sizeC*sizeB;
                    int position= 1;
                    position+=1;
                    inf[j][7]=String.valueOf(position);
                    System.out.println("Size to m3: "+sumSize );
                    System.out.println("Product was added successfully!");
                    startMenu(inf);
                } else if (inf[3][0]==null ){
                    int j=3;
                    System.out.println("Enter product name: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter expiry date:");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter entry date:: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter manufacturer: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter unit: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter available stock: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter comment (optional)");
                    inf[j][o] = scanner.next();
                    System.out.println("Enter size A: ");
                    int sizeA= scanner.nextInt();
                    System.out.println("Enter size B: ");
                    int sizeB= scanner.nextInt();
                    System.out.println("Enter size C: ");
                    int sizeC= scanner.nextInt();
                    int sumSize=sizeA*sizeC*sizeB;
                    int position= 1;
                    position+=1;
                    inf[j][7]=String.valueOf(position);
                    System.out.println("Size to m3: "+sumSize );
                    System.out.println("Product was added successfully!");
                    startMenu(inf);
                }else if (inf[4][0]==null ){
                    int j=4;
                    System.out.println("Enter product name: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter expiry date:");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter entry date:: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter manufacturer: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter unit: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter available stock: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter comment (optional)");
                    inf[j][o] = scanner.next();
                    System.out.println("Enter size A: ");
                    int sizeA= scanner.nextInt();
                    System.out.println("Enter size B: ");
                    int sizeB= scanner.nextInt();
                    System.out.println("Enter size C: ");
                    int sizeC= scanner.nextInt();
                    int sumSize=sizeA*sizeC*sizeB;
                    int position= 1;
                    position+=1;
                    inf[j][7]=String.valueOf(position);
                    System.out.println("Size to m3: "+sumSize );
                    System.out.println("Product was added successfully!");
                    startMenu(inf);
                }else {
                    int j=5;
                    o=0;
                    System.out.println("Enter product name: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter expiry date:");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter entry date:: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter manufacturer: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter unit: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter available stock: ");
                    inf[j][o] = scanner.next();
                    o += 1;
                    System.out.println("Enter comment (optional)");
                    o += 1;
                    inf[j][o] = scanner.next();
                    System.out.println("Enter size A: ");
                    int sizeA= scanner.nextInt();
                    System.out.println("Enter size B: ");
                    int sizeB= scanner.nextInt();
                    System.out.println("Enter size C: ");
                    int sizeC= scanner.nextInt();
                    int sumSize=sizeA*sizeC*sizeB;
                    int position= 1;
                    position+=1;
                    inf[j][7]=String.valueOf(position);
                    System.out.println("Size to m3: "+sumSize );
                    System.out.println("Product was added successfully!");
                    startMenu(inf);
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
    public static void listAllItems(String[][]information) {
      if (information[0][0]!=null) {
          int a=0;
          int j=0;
    System.out.println("Product name: " + information[j][a]);
          a+=1;
    System.out.println("Expiry date: " + information[j][a]);
          a+=1;
    System.out.println("Manufacturer: " + information[j][a]);
          a+=1;
    System.out.println("Unit: " + information[j][a]);
          a+=1;
    System.out.println("Stock: " + information[j][a]);
          a+=1;
    System.out.println("Available items at shelf: " + information[j][a]);
          a+=1;
    System.out.println("Comment: " + information[j][a]);
          a+=1;
          System.out.println("Position: A-" + information[j][a]);
          System.out.println();
          if (information[1][0]!=null) {
              a=0;
              j=1;
              System.out.println("Product name: " + information[j][a]);
              a += 1;
              System.out.println("Expiry date: " + information[j][a]);
              a += 1;
              System.out.println("Manufacturer: " + information[j][a]);
              a += 1;
              System.out.println("Unit: " + information[j][a]);
              a += 1;
              System.out.println("Stock: " + information[j][a]);
              a += 1;
              System.out.println("Available items at shelf: " + information[j][a]);
              a += 1;
              System.out.println("Comment: " + information[j][a]);
              a += 1;
              System.out.println("Position: A-" + information[j][a]);
              System.out.println();
              if (information [2][0]!= null) {
                  a=0;
                  j=2;
                  System.out.println("Product name: " + information[j][a]);
                  a += 1;
                  System.out.println("Expiry date: " + information[j][a]);
                  a += 1;
                  System.out.println("Manufacturer: " + information[j][a]);
                  a += 1;
                  System.out.println("Unit: " + information[j][a]);
                  a += 1;
                  System.out.println("Stock: " + information[j][a]);
                  a += 1;
                  System.out.println("Available items at shelf: " + information[j][a]);
                  a += 1;
                  System.out.println("Comment: " + information[j][a]);
                  a += 1;
                  System.out.println("Position: A-" + information[j][a]);
                  System.out.println();
                  if (information[3][0] != null) {
                      a=0;
                      j=3;
                      System.out.println("Product name: " + information[j][a]);
                      a += 1;
                      System.out.println("Expiry date: " + information[j][a]);
                      a += 1;
                      System.out.println("Manufacturer: " + information[j][a]);
                      a += 1;
                      System.out.println("Unit: " + information[j][a]);
                      a += 1;
                      System.out.println("Stock: " + information[j][a]);
                      a += 1;
                      System.out.println("Available items at shelf: " + information[j][a]);
                      a += 1;
                      System.out.println("Comment: " + information[j][a]);
                      a += 1;
                      System.out.println("Position: A-" + information[j][a]);
                      System.out.println();
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
        String allInformation[][] = new String[20][8];
        startMenu(allInformation);
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