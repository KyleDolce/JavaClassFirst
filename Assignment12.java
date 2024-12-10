import java.util.Scanner;

interface Car{
    void vroom();
    void description();
}

class Tesla implements Car{
    public void vroom(){
        System.out.println("The car cost RM 75,000");
    }
    public void description(){
        System.out.println("Yes Tesla is the best electric car.");
    }
}

class BMW implements Car{
    public void vroom(){
        System.out.println("The car cost RM 85,000");
    }
    public void description(){
        System.out.println("BMW is one of the coolest car in the world.");
    }
}

public class Assignment12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Which car do you prefer? Tesla or BMW :");
        String car = read.nextLine();
        if(car.equalsIgnoreCase("Tesla")){
            Car selectedCar = new Tesla();
            selectedCar.description();
        } else if (car.equalsIgnoreCase("BMW")){
            Car selectedCar = new BMW();
            selectedCar.description();
        } else{
            System.out.println("What car are you talking about?");
        }
    }
}
