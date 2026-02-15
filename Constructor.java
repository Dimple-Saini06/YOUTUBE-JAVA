public class Constructor {
    public static void main(String args[]) {
        //no argu obj
        Car c1 = new Car();

        //single argu 
        Car c2 = new Car("BMW");

        //two argu
        Car c3 = new Car("BMW", "BLACK");

        //two argu
        Car c4 = new Car("Black" , "BMW");
    } 
}

class Car {
    String name;
    String color;

    //no-arg constructor
    Car() {
        System.out.println("No argument passed in constructor..");
    }

    //single argument constructor
    Car(String name) {
        System.out.println("The car name is : " + name);
    }

    //two argument constructor
    Car(String name, String color){
        System.out.println("The Car name is : "+ name + " and color is : " + color);
    }
}


