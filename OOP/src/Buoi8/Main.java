package Buoi8;

import Buoi8.Animals.Dog;
import Buoi8.Interface.IZoo;

public class Main {
    public static void main(String[] args) {
        IZoo zoo = new Zoo();
        Animal animal = new Dog();
        animal.inputInfo("Chó");
        zoo.addAnimal(animal);
        zoo.displayAllInfo();
    }
}
