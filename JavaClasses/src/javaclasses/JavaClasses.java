/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaclasses;

/**
 *
 * @author Babygirl
 */
public class JavaClasses {

     // Attributes
    private String name;
    private int age;
    
    // Constructor
    public JavaClasses(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        // Create an instance of the javaClasses class
        JavaClasses person1 = new JavaClasses("John Doe", 25);

        // Display information using the displayInfo method
        System.out.println("Information for person1:");
        person1.displayInfo();

        // Update age using the setter method
        person1.setAge(26);

        // Display updated information
        System.out.println("\nUpdated information for person1:");
        person1.displayInfo();
    }
    
}
