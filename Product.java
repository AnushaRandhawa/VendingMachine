import java.util.Scanner;

public class Product {

    String name;
    int price;
    int payment;
    int p;
    int n;
    int d;
    int q;
    int h;
    int dollar;
    String r;


    public Product(String name, int price) {
       this.name = name;
        this.price = price;
    }

    Scanner sc = new Scanner(System.in);
    public void buy() {
        int change;


        System.out.println("Please pay");
        System.out.println("Pennies: ");
        p = sc.nextInt();
        System.out.println("Nickels: ");
        n = sc.nextInt();
        System.out.println("Dimes: ");
        d = sc.nextInt();
        System.out.println("Quarters: ");
        q = sc.nextInt();
        System.out.println("Halves: ");
        h = sc.nextInt();
        System.out.println("Dollar Notes: ");
        dollar = sc.nextInt();

        payment = 1 * p + 5 * n + 10 * d + 25 * q + 50 * h + 100 * dollar;

        change = payment - price;

        System.out.println("If you want to cancel your request and want a refund, please press R, otherwise press P to proceed");
        r = sc.next();
        if (r.equals("R")) refund();
        else {
            dollar = change / 100;
            change %= 100;
            h = change / 50;
            change %= 50;
            q = change / 25;
            change %= 25;
            d = change / 10;
            change %= 10;
            n = change / 5;
            change %= 5;
            p = change / 1;
            change %= 1;


            System.out.println("Here is your product: " + name);
            // System.out.println("Your change is: " + change);
            System.out.println("Please take your change - " + dollar + " Dollars, " + h + " Halves, " +
                    q + " Quarters, " + d + " Dimes, " + n + " Nickels, and " + p + " Pennies.");
            System.out.println("Thank You");

        }

    }

    public void refund() {
            System.out.println("Okay! Here's your refund, Thanks");
            System.out.println(dollar + " Dollars, " + h + " Halves, " +
                    q + " Quarters, " + d + " Dimes, " + n + " Nickels, and " + p + " Pennies.");
        }

    }


