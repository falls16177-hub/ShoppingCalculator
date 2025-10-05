import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price of the item: ");
        int ItemPrice = input.nextInt();
        double ShipCost = ItemPrice * 0.02;
        double TotalCost = ItemPrice + ShipCost;

        if (ItemPrice >= 100) {
            System.out.print("Shipping is free your total price is: " + ItemPrice);
        } else if (ItemPrice < 100) {
            System.out.print("Your total price is: " + TotalCost);

        }
    }
}