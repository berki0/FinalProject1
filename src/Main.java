import java.util.Scanner;
public class Main {

    public static void startMenu(String[][] allInf,int j,int counter) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose what to do (0 - Exit; 1 - List all items; 2 - Add new delivery; 3 - List deliveries for time period)");
        String choice = scanner.nextLine();
        switch (choice) {
            case "0": //exit
                break;
            case "1":
                listAllItems(allInf,j,counter);
                break;
            case "2":
                j++;
                addNewItem(allInf, j,counter);
                break;
            case "3":
                listDeliveriesForTimePeriod(allInf,j);
                break;
            default:
                System.out.println("Invalid Selection");
                System.out.println("Please select again (1-3)");
                startMenu(allInf,j,counter);
        }
    }
    public static void addNewItem(String[][] allInf, int j,int counter) {
        Scanner scanner = new Scanner(System.in);

            while (allInf[j][0] == null){
                int q=0;
                    System.out.println("Enter product name: ");
                    allInf[j][q] = scanner.nextLine();//product name
                    q += 1;
                    System.out.println("Enter expiry date  (as DD:MM:YY) :");
                    allInf[j][q] = scanner.nextLine();//expiry date
                    q += 1;
                    System.out.println("Entry date is (as DD:MM:YY): ");
                    allInf[j][q] = scanner.nextLine();//entry date
                    q += 1;
                    System.out.println("Enter manufacturer: ");
                    allInf[j][q] = scanner.nextLine();//manufacturer
                    q += 1;
                    System.out.println("Enter unit: ");
                    allInf[j][q] = scanner.nextLine();//units
                    q += 1;
                    System.out.println("Enter available stock( as an Integer ): ");
                    allInf[j][q] = scanner.nextLine();//available stocks
                    q += 1;
                    System.out.println("Enter comment (optional)");
                    allInf[j][q] = scanner.nextLine();//comments
                    System.out.println("Product was added successfully!");
                    System.out.println();
                    System.out.println("Enter size A (as meters 60cm = 0,6 m): ");
                    double sizeA = scanner.nextDouble();
                    System.out.println("Enter size B (as meters 60cm = 0,6 m): ");
                    double sizeB = scanner.nextDouble();
                    System.out.println("Enter size C (as meters 60cm = 0,6 m): ");
                    double sizeC = scanner.nextDouble();
                    double sumSize = sizeA * sizeC * sizeB;
                    System.out.println("Product was added successfully!");
                System.out.println();
                sortProducts(allInf, j,sumSize,counter);
                break;
        }
        startMenu(allInf,j,counter);
    }
        public static void listAllItems (String[][]allInf,int j,int counter){
            if (allInf[0][0]==null){
                System.out.println("Please enter Products !");
                startMenu(allInf,j,counter);
            }
            j=0;
            while (allInf[j][0]!=null){
                int q = 0;
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
                System.out.println("Position: " + allInf[j][q]);
                System.out.println();
                j++;
                System.out.println();
            }
        startMenu(allInf,j,counter);
        }
        public static void sortProducts(String[][]allInf,int j,double sumSize,int counter) {
            sumSize = sumSize * Double.valueOf(allInf[j][5]);
            counter++;
            System.out.println("Size as m3 : "+sumSize);
            if (sumSize>0&&sumSize <= 10) {
                allInf[j][7] = "A|Section 1| Product serial number "+ String.valueOf(counter);
            } else if (sumSize < 20 && sumSize >= 10) {
                allInf[j][7] = "A|Section 2|Product serial number "+ String.valueOf(counter);
            } else if (sumSize < 30 && sumSize >= 20) {
                allInf[j][7] = "A|Section 3|Product serial number "+ String.valueOf(counter );
            } else if (sumSize < 40 && sumSize >= 30) {
                allInf[j][7] = "A|Section 4|Product serial number "+ String.valueOf(counter);
            }else if (sumSize < 50 && sumSize >= 40) {
                allInf[j][7] = "A|Section 5|Product serial number "+ String.valueOf(counter);
            }else if (sumSize < 60 && sumSize >= 50) {
                allInf[j][7] = "A|Section 6|Product serial number " + String.valueOf(counter);
            }else if (sumSize < 70 && sumSize >=60) {
                allInf[j][7] = "A|Section 7|Product serial number "+ String.valueOf(counter);
            }else if (sumSize < 80 && sumSize >= 70) {
                allInf[j][7] = "A|Section 8|Product serial number "+ String.valueOf(counter);
            }else if (sumSize < 90 && sumSize >= 80) {
                allInf[j][7] = "A|Section 9|Product serial number "+ String.valueOf(counter);
            }else if (sumSize < 100 && sumSize >= 90) {
                allInf[j][7] = "A|Section 10|Product serial number "+ String.valueOf(counter);
            }else {
                allInf[j][7] = "O|Section XXX|Product serial number ERORR!!!!!!- "+ String.valueOf(counter+1);
            }
            startMenu(allInf, j,counter);
        }
        public static void listDeliveriesForTimePeriod (String[][] allInf,int j) {
            Scanner scanner = new Scanner(System.in);
            if (allInf[0][0] != null) {
                System.out.println("From Date (as DD:MM:YY):");
                String startDate = scanner.nextLine();
                String[] s = startDate.split(":");
                int[] s1 = new int[3];
                for (int i = 0; i < s.length; i++) {
                    s1[i] = Integer.valueOf(s[i]);
                }
                System.out.println("To Date (as DD:MM:YY)");
                String endDate = scanner.nextLine();
                String[] e = endDate.split(":");
                int[] e1 = new int[3];
                for (int i = 0; i < e.length; i++) {
                    e1[i] = Integer.valueOf(e[i]);
                }
                System.out.println();
                int [][]dateArray=new int [20][3];
                for (int i = 0; i < allInf.length; i++) {
                    if (allInf[i][2]!=null){
                        for (int k = 0; k < dateArray[0].length ; k++) {
                            dateArray[i][k]=Integer.parseInt(allInf[k][2]);
                        }
                    }

                }
            }else {
                System.out.println("Please enter Products !");
                startMenu(allInf,j,0);
            }
        }
        public static void main (String[]args){
            String allInformation[][] = new String[20][8];
            int j=-1;
            int counter=0;
            startMenu(allInformation,j,counter);
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