import java.util.Scanner;

public class ImportScanner {
    public static void main(String[] args) {
        Scanner myimput = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = myimput.nextLine();
        System.out.println("Greetings " + name);
    }
}