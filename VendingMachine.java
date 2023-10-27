import java.util.Scanner;
public class VendingMachine {



    public static void main(String[] args) {
      Runmachine();
    }

    public static void Runmachine() {

        Scanner sc = new Scanner(System.in);
 /* Product Candy = new Product(10);
        Product Snack = new Product( 50);
        Product Nuts = new Product( 90);
        Product Coke = new Product( 25);
        Product Pepsi = new Product( 35);
        Product Soda = new Product( 45); */
        Product p1 = new Product("Candy", 10);
        Product p2 = new Product("Snack", 50);
        Product p3 = new Product("Nuts", 90);
        Product p4 = new Product("Coke", 25);
        Product p5 = new Product("Pepsi", 35);
        Product p6 = new Product("Soda" , 65);

        System.out.println("What product do you want to buy?");
        System.out.println("Candy, Snack, Nuts, Coke, Pepsi, Soda");
        String name = sc.nextLine();
        // Product name = new Product();
        switch (name) {
            case "Candy":
                p1.buy();
                break;
            case "Snack":
                p2.buy();
                break;
            case "Nuts":
                p3.buy();
                break;
            case "Coke":
                p4.buy();
                break;
            case "Pepsi":
                p5.buy();
                break;
            case "Soda":
                p6.buy();
                break;
        }

        reset();
    }

   public static void reset() {
       System.out.println();
       System.out.println("The machine has been reset");
       Runmachine();
   }
}