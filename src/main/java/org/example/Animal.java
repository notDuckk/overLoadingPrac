package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    String name;
    Boolean yayNay;

    public Animal(String name, Boolean yayNay){
        this.name = name;
        this.yayNay = yayNay;
    }

    public Animal(String name){
        this.name = name;
        this.yayNay = false;
    }

    public String getName(String name) {
        return this.name = name;
    }

    public Boolean getYayNay(Boolean yayNay) {
        return this.yayNay = yayNay;
    }

    @Override
    public String toString() {
        return getName(name) + " is a dog = " + getYayNay(yayNay);
    }

    public static void main(String[] args) {
        // ANIMAL PORTION -----------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        ArrayList<Animal> myList = new ArrayList<>();

        //Add object using overloaded constructor
        Animal Luke = new Animal("Luke");

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop.");
        while (true) {
            System.out.println("Please enter a name: ");
            String name = input.nextLine();
            if (name.isEmpty()) {
                break;
            }
            // I had to put this here otherwise it would rint out even when the loop was broken
            System.out.println("Is it a dog? Yes or No: ");
            String answer = input.nextLine();
            Boolean ansBool = Boolean.parseBoolean(answer);
            // If statement to verify if they typed a valid option
            if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("No"))) {
                System.out.println("Please enter a valid option.");
                System.out.println("Is it a dog? Yes or No: ");
                answer = input.nextLine();
                ansBool = Boolean.parseBoolean(answer);
            }
            // If statement to give ansBool a value
            if (answer.equalsIgnoreCase("Yes")) {
                ansBool = true;
            } else if (answer.equalsIgnoreCase("No")) {
                ansBool = false;
            }
            // adding the new Animal you created to the list and storing it as an animal object
            myList.add(new Animal(name,ansBool));
        }
        // printing the animals/not animal in the list
        for (Animal a : myList) {
            System.out.println(a);
        }
        // ANIMAL PORTION END ---------------------------------------------------------------------------
    }

}
