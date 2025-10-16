public class Abstractionn {
    public static void main(String[] args){

        Mustang myhorse = new Mustang();
        //Animal -> Horse -> Mustang
    //    Horse h = new Horse();
    //    h.eat();
    //    h.walk();

    //    System.out.println(h.color);

    //    Chicken c = new Chicken();
    //    c.eat();
    //    c.walk();
    }
}
abstract class Animal {
    String color;

    Animal(){
        // color = "brown";
        System.out.println("Animal construtctor Called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changecolor(){
        color = "dark Brown";
    }
    
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang constructore called");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}