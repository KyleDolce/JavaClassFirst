import java.util.Scanner;

public class ActivityTwo {
    private String carModel;
    private String carName;
    private double carPrice;

    public ActivityTwo(String carModel, String carName, double carPrice) {
        this.carModel = carModel;
        this.carName = carName;
        this.carPrice = carPrice;
    }

    public void displayCarDetails() {
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Name: " + carName);
        System.out.println("Car Price: RM" + carPrice);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("How many car would you like to register?");
        int n = scan.nextInt();
        scan.nextLine();
        double totalPrice=0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for car " + (i + 1) + ":");
            System.out.print("Car Model: ");
            String carModel = scan.nextLine();
            System.out.print("Car Name: ");
            String carName = scan.nextLine();
            System.out.print("Car Price: RM");
            double carPrice = scan.nextDouble();
            scan.nextLine();

            totalPrice += carPrice;
        }


        double averagePrice = totalPrice / n;
        System.out.println("Average Car Price: RM" + averagePrice);
    }
}
