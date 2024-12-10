import java.util.Scanner;
class Cars{
    void vroom(){
        System.out.println("No car is selected");
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

public class Assignment10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Which car do you want to buy? Toyota,BMW or Tesla :");
        String car = read.nextLine();
        switch(car){
            case "Toyota":
                Cars selectCars = new Toyota();
                selectCars.vroom();
                break;
            case "BMW":
                Cars selectCars2 = new BMW();
                selectCars2.vroom();
                break;
            case "Tesla":
                Cars selectedCars3 = new Tesla();
                selectedCars3.vroom();
                break;
            default:
                System.out.println("Invalid car input");
                break;
        }
        read.close();
    }
}
