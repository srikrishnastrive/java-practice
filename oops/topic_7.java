interface Animal {
    void bark();
    default void sleep(){
        System.out.println("Sleeping..........");
    } 
}
interface Pet {
    void ownerName();
}

class Dog implements Animal,Pet{
    public void bark(){
        System.out.println("Bark!!!!!!!!!!");
    }
    @Override
    public void sleep(){
        System.out.println("Dog is sleeping!!!!!!!!!!");
    }

    public void ownerName(){
        System.out.println("srikrishna");
    }
    
    
}

class Cat implements Animal,Pet {
    public void bark(){
        System.out.println("meow !!!!!!!!!!!");
    }
    @Override
    public void sleep(){
        System.out.println("Cat  is sleeping!!!!!!!!!!");
    }
    public void ownerName(){
        System.out.println("sree");
    }
    
}

public class topic_7 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.sleep();
        dog.ownerName();

        Cat cat = new Cat();
        cat.bark();
        cat.sleep();
        cat.ownerName();
    }
}
