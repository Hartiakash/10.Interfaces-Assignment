package Interfaces_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_interfaces.html
 *
 * 01. Create an interface with only one method and implement it in a class. Call the method
 * implemented.
 */

//An interface is declared by using the interface keyword.
interface Jala_01 {
    //An abstract method doesn't have its body, and they are public and abstract
    void oneMethod();
}

public class InterfaceOneMethod implements Jala_01 {
    @Override
    public void oneMethod() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        InterfaceOneMethod if1 = new InterfaceOneMethod();
        //Calling the method implemented
        if1.oneMethod();
    }
}
