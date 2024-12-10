import java.util.*;
class Toyota{
    void vroom(){
        System.out.println("The car cost RM 25,000");
    }
}

class BMW{
    void vroom(){
        System.out.println("The car cost RM 85,000");
    }
}

class Tesla{
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
                Toyota toyota = new Toyota();
                toyota.vroom();
                break;
            case "BMW":
                BMW bmw = new BMW();
                bmw.vroom();
                break;
            case "Tesla":
                Tesla tesla = new Tesla();
                tesla.vroom();
                break;
        }
        read.close();
    }
}
