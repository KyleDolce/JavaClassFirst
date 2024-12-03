import java.util.Scanner;

public class Assignment8 {
    private String name;
    private int age;
    private int height;
    private int weight;
    private double bmi;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public double getBMI() {
        return bmi;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBMI(double bmi) {
        this.bmi = bmi;
    }

    public double calculateBMI(int height, int weight) {
        double bmi = (height - 100) / weight;
        return bmi;
    }

    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        Assignment8 peopleBMI = new Assignment8();

        System.out.println("Please insert the user name: ");
        String name = take.nextLine();
        peopleBMI.setName(name);

        System.out.println("Please insert user's age: ");
        int age = take.nextInt();
        peopleBMI.setAge(age);

        System.out.println("Please insert user's height (in cm): ");
        int height = take.nextInt();
        peopleBMI.setHeight(height);

        System.out.println("Please insert user's weight (in kg): ");
        int weight = take.nextInt();
        peopleBMI.setWeight(weight);

        double bmi = peopleBMI.calculateBMI(height, weight);
        peopleBMI.setBMI(bmi);

        System.out.println("The person's name is " + peopleBMI.getName() +" and they are " + peopleBMI.getAge() + " years old. " +"Their BMI is " + peopleBMI.getBMI());
        
        take.close();
    }
}
