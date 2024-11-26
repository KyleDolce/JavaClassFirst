public class AssignmentOne {
    //private variables
    private int carManufacturedYear;
    private double carPrice;
    private String carName;

    //constructor
    public AssignmentOne(int carManufacturedYear, double carPrice, String carName) {
        this.carManufacturedYear = carManufacturedYear;
        this.carPrice = carPrice;
        this.carName = carName;
    }

    //method to later display the car details also calculation
    public void displayCarDetails() {
        double carCalculation = carPrice*carManufacturedYear;
        System.out.println("Car Name: " + carName);
        System.out.println("Car Manufactured Year: " + carManufacturedYear);
        System.out.println("Car Price: RM" + carPrice);
        System.out.println("Car Calculation: RM" + carCalculation);
    }
    
    //main method to send value then call method to display
    public static void main(String[] args) {
        AssignmentOne car = new AssignmentOne(2023, 168888, "Nissan Leaf");
        car.displayCarDetails();
    }
}
