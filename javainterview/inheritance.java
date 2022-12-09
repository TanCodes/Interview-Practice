// Single Inheritance

class Animal{
    public void eat(){
        System.out.println("eats nonveg or veg");
    }
}

class Dog extends Animal{
    public void legs(){
        System.out.println("Dog as 4 legs");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.legs();
    }
}
