package Bai1.Zoo;

import Bai1.Animal;
import Bai1.Animals.Bird;

import java.util.ArrayList;

public class Zoo {
    protected ArrayList<Animal> zoos;
    public Zoo() {
        this.zoos = new ArrayList<>();
    }
    public void addAnimal(Animal animal) {
        this.zoos.add(animal);
    }
    public void makeAllSound() {
        for (Animal animal : zoos) {
            animal.makeSound();
        }
    }
    public void makeBirdsFly() {
        for (Animal animal : zoos) {
            if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }
        }
    }
    public void displayAllInfo() {
        for (Animal animal : zoos) {
            animal.displayInfo();
            System.out.println("-----------------------");
        }
    }

}
