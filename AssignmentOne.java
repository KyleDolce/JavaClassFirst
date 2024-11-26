public class AssignmentOne {
    private int carManufacturedYear;
    private double carPrice;
    private String carName;

    public AssignmentOne(int carManufacturedYear, double carPrice, String carName) {
        this.carManufacturedYear = carManufacturedYear;
        this.carPrice = carPrice;
        this.carName = carName;
    }

    public void displayCarDetails() {
        double carCalculation = carPrice*carManufacturedYear;
        System.out.println("Car Name: " + carName);
        System.out.println("Car Manufactured Year: " + carManufacturedYear);
        System.out.println("Car Price: RM" + carPrice);
        System.out.println("Car Calculation: RM" + carCalculation);
    }
    
    public static void main(String[] args) {
        AssignmentOne car = new AssignmentOne(2023, 168888, "Nissan Leaf");
        car.displayCarDetails();
    }
}
