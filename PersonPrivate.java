public class PersonPrivate {
    //private variables
    private String name;
    private int age;
    private double height;
    private double weight;

    //constructor
    public PersonPrivate(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    //method to display details
    public void displayDetails() {
        double bmi = weight / (height * height);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height +"m");
        System.out.println("Weight: " + weight +"kg");
        System.out.println("BMI: " + bmi);
    }

    //main method
    public static void main(String[] args) {
        PersonPrivate person = new PersonPrivate("Tan Kai Jie", 22, 1.65, 65);
        person.displayDetails();
}
}
