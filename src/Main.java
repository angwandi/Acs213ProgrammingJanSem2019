
// Create a MyClass class
class MyClass {
    int x;  // Create a class attribute

    // Create a class constructor for the MyClass class
    private MyClass() {
        x = 5;  // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass(); // Create an object of class MyClass (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }

}

class Car {
    private int modelYear;
    private String modelName;
    //Parameterized constructor

    private Car(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Car myCar = new Car(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
        System.out.println("********");
        System.out.println("      **");
        System.out.println("      **");
        System.out.println("      **");
        System.out.println("**    **");
        System.out.println("**    **");
        System.out.println(" *******");
        System.out.println("third");
    }
}
