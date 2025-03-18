package Bai1.Zoo;

import Bai1.Animal;
import Bai1.Animals.Bird;

import java.util.ArrayList;

public class Zoo {
    protected Animal[] zoos;
    public Zoo() {
        this.zoos = new Animal[2];
    }
    public void addAnimal(Animal animal) {
        if(zoos[zoos.length-1] != null){
            Animal [] newZoos = new Animal[zoos.length*2];
            for(int i=0; i<zoos.length; i++){
                newZoos[i] = zoos[i];
            }
            newZoos[zoos.length] = animal;
            this.zoos = newZoos;
            return;
        }
        for(int i=0; i<zoos.length; i++){
            if(zoos[i] == null){
                zoos[i] = animal;
            }
        }
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
