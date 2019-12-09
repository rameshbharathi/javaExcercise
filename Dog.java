package com.ramesh;

public class Dog extends Animal {

    private int legs;
    private int tail;
    private String breed;


    public Dog(String name, int size, int weight, int legs, int tail, String breed) {
        super(name, 1, 1, size, weight);
        this.legs = legs;
        this.tail = tail;
        this.breed = breed;
    }

  private void chew() {
      System.out.println("Dog.Chew() method called");
  }

    @Override
    public void eat() {
        System.out.println("Dog.eat() method called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run called");
        move(10);
    }
}
