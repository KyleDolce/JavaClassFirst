
import java.util.*;
abstract class Cars{
    abstract void vroom();
    
    void slogan(){
        System.out.println("It is time to go Fast and Furious with the F&F car deals");
    }
    void gratitude(){
        System.out.println("Thank you for choosing us!");
    }
}

class Toyota extends Cars{
    void vroom(){
        System.out.println("The car cost RM 25,000");
    }
}

class BMW extends Cars{
    void vroom(){
        System.out.println("The car cost RM 85,000");
    }
}

class Tesla extends Cars{
    void vroom(){
        System.out.println("The car cost RM 75,000");
    }
}

public class Assignment11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome! Please select a car to view the price (Toyota, BMW or Tesla) :");
        String car = read.nextLine();
        if (car.equalsIgnoreCase("Toyota")){
            Cars selectedCars = new Toyota();
            selectedCars.slogan();
            selectedCars.vroom();
            selectedCars.gratitude();
        } else if (car.equalsIgnoreCase("BMW")){
            Cars selectedCars = new BMW();
            selectedCars.slogan();
            selectedCars.vroom();
            selectedCars.gratitude();
        } else if (car.equalsIgnoreCase("Tesla")){
            Cars selectedCars = new Tesla();
            selectedCars.slogan();
            selectedCars.vroom();
            selectedCars.gratitude();
        } else {
            System.out.println("Invalid car selection.");
        }
    }
}
