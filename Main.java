package com.ramesh;

public class Main {

    public static void main(String[] args) {
	Animal animal = new Animal("Dog", 1,1,3,3);

	Dog dog = new Dog("MyDogI",3,3,4,1,"GermanSheaperd");
	dog.eat();
        System.out.println("Animal Name:" + animal.getName());
        System.out.println("Dog Name: " + dog.getName());
        dog.walk();
        animal.move(2);
        dog.run();
    }
}
