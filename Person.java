public class Person {
    String name = "Tan Kai Jie";
    int age = 22;
    double height = 1.65;

    public void displayPerson(){
        System.out.println("My name is : " + name);
        System.out.println("My age is : " + age);
        System.out.println("My height is " +height + "m");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.displayPerson();
        
    }
}
