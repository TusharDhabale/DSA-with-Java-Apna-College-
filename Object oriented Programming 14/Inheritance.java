public class Inheritance {
    public static void main(String[] args) {
         Dog dobby = new Dog();
         dobby.eat();
         dobby.legs = 4;
         System.out.println(dobby.legs);
    }
}
//Base class
class Animal{ 
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends  Animal {
    void walks(){
        System.err.println("walks");
    }
}

class Fish extends  Animal {
    void swim(){
        System.err.println("swim");
    }
}

class Bird extends  Animal {
    void fly(){
        System.err.println("flies ");
    }
}

// class Dog extends Mammal {
//     String breed;
// }
//Derive class
// class Fish extends Animal {
//     int fins;

//     void swimm() {
//         System.out.println("Swims in water");
//     }
// }