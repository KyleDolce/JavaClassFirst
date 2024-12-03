import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("What day is it today? Please input a number from 1 to 7 :");
        int day = read.nextInt();
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName= "Wednesday";
                break;
            case 4:
                dayName= "Thrusday";
                break;
            case 5:
                dayName= "Friday";
                break;
            case 6:
                dayName= "Saturday";
                break;
            case 7:
                dayName= "Sunday";
                break;
            default:
                dayName = "Invalid day input";
                break;
        }
        System.out.println("Today is "+dayName);
    }
    
}
