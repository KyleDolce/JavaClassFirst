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

    public double getCarPrice() {
        return carPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ActivityTwo[] cars = new ActivityTwo[3];

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Enter details for car " + (i + 1) + ":");
            System.out.print("Car Model: ");
            String carModel = scanner.nextLine();
            System.out.print("Car Name: ");
            String carName = scanner.nextLine();
            System.out.print("Car Price: RM");
            double carPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            cars[i] = new ActivityTwo(carModel, carName, carPrice);
        }

        double totalPrice = 0;
        for (ActivityTwo car : cars) {
            System.out.println();
            System.out.println();
            car.displayCarDetails();
            System.out.println();
            totalPrice += car.getCarPrice();
        }

        double averagePrice = totalPrice / cars.length;
        System.out.println("Average Car Price: RM" + averagePrice);
    }
}
