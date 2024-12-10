
class Calculator{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}

//Run-time Plolymorphism

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat is meowing");
    }
}



public class Polymorphism {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum :"+calc.add(5, 6));
        System.out.println("Sum :"+calc.add(5.5, 6.6));

        //Run-time Polymorphism
        Animal animal = new Dog();
        animal.sound();
        Animal animal2 = new Cat();
        animal2.sound();
        Animal animal3 = new Animal();
        animal3.sound();
    }
    
}
