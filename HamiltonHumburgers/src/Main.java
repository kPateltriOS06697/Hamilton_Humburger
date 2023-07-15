import java.util.Scanner;

public class Main
{
        public static void main(String[] args) {
            double VeggieBurger = 5.95;
            double DeluxeVeggieBurger = 7.95;
            double ChickenBurger = 6.45;
            double CheeseChickenBurger = 8.50;
            double CheeseBaconBurger = 9.25;
            double DeluxeBaconBurger = 10.95;
            double HealthyOrganicBurger = 12.45;
            double total = 0;

            System.out.println("***********Hamilton Hamburgers***********");
            System.out.println("\t\t\t\t\tMenu");
            System.out.print("\tType of Burger");
            System.out.println("\t\t\tPrice");
            System.out.print("1.\tVeggie Burger");
            System.out.println("\t\t\t$5.95");
            System.out.print("2.\tDeluxe Veggie Burger");
            System.out.println("\t$7.95");
            System.out.print("3.\tChicken Burger");
            System.out.println("\t\t\t$6.45");
            System.out.print("4.\tCheese Chicken Burger");
            System.out.println("\t$8.50");
            System.out.print("5.\tCheese Bacon Burger");
            System.out.println("\t\t$9.25");
            System.out.print("6.\tDeluxe Bacon Burger");
            System.out.println("\t\t$10.95");
            System.out.print("7.\tHealthy Organic Burger");
            System.out.println("\t$12.45");
            System.out.println("8.\tQuit");


            Scanner input = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int menu = input.nextInt();


            switch (menu) {
                case 1: {
                    System.out.println("You have selected Veggie Burger.");
                }
                System.out.print("Enter the desired quntity:");
                int quntity = input.nextInt();
                total = total + quntity * VeggieBurger;
                break;

                case 2: {
                    System.out.println("You have selected Deluxe Veggie Burger.");
                }
                System.out.print("Enter the desired quntity:");
                quntity = input.nextInt();
                total = total + quntity * VeggieBurger;
                break;

                case 3: {
                    System.out.println("You have selected Chicken Burger.");
                }
                System.out.print("Enter the desired quntity:");
                quntity = input.nextInt();
                total = total + quntity * VeggieBurger;
                break;

                case 4: {
                    System.out.println("You have selected Cheese Chicken Burger.");
                }
                System.out.print("Enter the desired quntity:");
                quntity = input.nextInt();
                total = total + quntity * VeggieBurger;
                break;

                case 5: {
                    System.out.println("You have selected Cheese Bacon Burger.");
                }
                System.out.print("Enter the desired quntity:");
                quntity = input.nextInt();
                total = total + quntity * VeggieBurger;
                break;

                case 6: {
                    System.out.println("You have selected Deluxe Bacon Burger.");
                }
                System.out.print("Enter the desired quntity:");
                quntity = input.nextInt();
                total = total + quntity * VeggieBurger;
                break;

                case 7: {
                    System.out.println("You have selected Healthy Organic Burger.");
                }
                System.out.print("Enter the desired quntity:");
                quntity = input.nextInt();
                total = total + quntity * VeggieBurger;
                break;

                default: {
                    System.out.println("Enter the number between 1 to 8.Thank you!!");
                }
                break;
            }

            System.out.println("Do you want to order anything else(Yes/No)(Yes=1,No=0?");



        }






}