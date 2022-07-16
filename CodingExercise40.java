import java.util.Scanner;

public class CodingExercise40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What Type Of Burger Do You Want? : ");
        System.out.println("Choose 1 For Hamburger ( With White / Brown Bread )" +
                "\nChoose 2 For Super Burger ( Brown Bread Is Used )" +
                "\nChoose 3 For Deluxe Burger ( Comes With Chips And Drinks, Add On Not Available )" +
                "\nChoose 0 To Exit The Menu.");

        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("You Are Ordering Hamburger...");
                System.out.println("Enter Choice Of Bread: ");
                String bread = scanner.nextLine();
                System.out.println("Enter Choice Of Meat: ");
                String hamMeat = scanner.nextLine();
                Hamburger hamburger = new Hamburger(bread, hamMeat);
                hamburger.askAddOn();
                hamburger.generateBill();
                break;
            case 2:
                System.out.println("You Are Ordering Super Burger...");
                System.out.println("It Comes With Brown Bread...");
                System.out.println("Enter Choice Of Meat: ");
                String healthyMeat = scanner.nextLine();
                SuperBurger superBurger = new SuperBurger("Brown Bread", healthyMeat);
                superBurger.askAddOn();
                superBurger.generateBill();
                break;
            case 3:
                System.out.println("You Are Ordering Deluxe Burger...");
                System.out.println("It Comes With Chips And Drinks...");
                System.out.println("No Add Ons Are Available...");
            case -1:
                break;
        }

        scanner.close();
    }

}

class Hamburger {
    private String bread;
    private String meat;

    protected boolean lettuce = false;
    protected boolean tomato = false;
    protected boolean bacon = false;
    protected boolean cheeze = false;

    protected double lettucePrice = 5;
    protected double tomatoPrice = 5;
    protected double baconPrice = 10;
    protected double cheezePrice = 10;

    private double price = 30;

    public Hamburger(String bread, String meat) {
        this.bread = bread;
        this.meat = meat;
    }

    protected void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    protected void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    protected void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    protected void setCheeze(boolean cheeze) {
        this.cheeze = cheeze;
    }

    public void askAddOn() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would You Like Lettuce In Your Hamburger? (Y/N)");
        String choice = scanner.nextLine();
        if (choice.toLowerCase().equals("y")) {
            this.setLettuce(true);
        }
        System.out.println("Would You Like Tomato In Your Hamburger? (Y/N)");
        choice = scanner.nextLine();
        if (choice.toLowerCase().equals("y")) {
            this.setTomato(true);
        }
        System.out.println("Would You Like Bacon In Your Hamburger? (Y/N)");
        choice = scanner.nextLine();
        if (choice.toLowerCase().equals("y")) {
            this.setBacon(true);
        }
        System.out.println("Would You Like Cheeze In Your Hamburger? (Y/N)");
        choice = scanner.nextLine();
        if (choice.toLowerCase().equals("y")) {
            this.setCheeze(true);
        }

        scanner.close();
    }

    protected double calculatePrice() {
        double finalPrice = this.price;
        System.out.println("Add On Added Are - ");

        if (this.lettuce) {
            System.out.println("Lettuce - " + this.lettucePrice + "$");
            finalPrice = finalPrice + this.lettucePrice;
        }
        if (this.tomato) {
            System.out.println("Tomato - " + this.tomatoPrice + "$");
            finalPrice = finalPrice + this.tomatoPrice;
        }
        if (this.bacon) {
            System.out.println("Bacon - " + this.baconPrice + "$");
            finalPrice = finalPrice + this.baconPrice;
        }
        if (this.cheeze) {
            System.out.println("Cheeze - " + this.cheezePrice + "$");
            finalPrice = finalPrice + this.cheezePrice;
        }
        return finalPrice;
    }

    public void generateBill() {
        System.out.println("You have ordered a Hamburger with " + this.bread + " bread and " + this.meat + ".");
        System.out.println("Your total billing amount is " + this.calculatePrice());
    }

}

class SuperBurger extends Hamburger {
    private boolean egg = false;
    private boolean mushroom = false;

    private double eggPrice = 10;
    private double mushroomPrice = 15;
    private double price = 50;

    public SuperBurger(String breadRoll, String meat) {
        super(breadRoll, meat);
    }

    private void setEgg(boolean egg) {
        this.egg = egg;
    }

    private void setMushroom(boolean mushroom) {
        this.mushroom = mushroom;
    }

    @Override
    public void askAddOn() {
        Scanner scanner = new Scanner(System.in);
        super.askAddOn();
        System.out.println("Would You Like Egg In Your Super Hamburger? (Y/N)");
        String choice = scanner.nextLine();
        if (choice.toLowerCase().equals("y")) {
            this.setEgg(true);
        }
        System.out.println("Would You Like Mushroom In Your Hamburger? (Y/N)");
        choice = scanner.nextLine();
        if (choice.toLowerCase().equals("y")) {
            this.setMushroom(true);
        }
        scanner.close();
    }

    @Override
    protected double calculatePrice() {
        double finalPrice = this.price;

        if (this.lettuce) {
            System.out.println("Lettuce - " + this.lettucePrice + "$");
            finalPrice = finalPrice + this.lettucePrice;
        }
        if (this.tomato) {
            System.out.println("Tomato - " + this.tomatoPrice + "$");
            finalPrice = finalPrice + this.tomatoPrice;
        }
        if (this.bacon) {
            System.out.println("Bacon - " + this.baconPrice + "$");
            finalPrice = finalPrice + this.baconPrice;
        }
        if (this.cheeze) {
            System.out.println("Cheeze - " + this.cheezePrice + "$");
            finalPrice = finalPrice + this.cheezePrice;
        }
        if (this.egg) {
            System.out.println("Egg - " + this.eggPrice + "$");
            finalPrice = finalPrice + this.eggPrice;
        }
        if (this.mushroom) {
            System.out.println("Mushroom - " + this.mushroomPrice + "$");
            finalPrice = finalPrice + this.mushroomPrice;
        }

        return finalPrice;
    }

}

class DeluxeHamburger extends Hamburger {
    private double deluxeBurgerPrice = 50;

    public DeluxeHamburger(String breadRoll, String meat) {
        super(breadRoll, meat);
    }

    public double getDeluxeBurgerPrice() {
        return this.deluxeBurgerPrice;
    }

}
