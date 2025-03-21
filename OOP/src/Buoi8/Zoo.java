package Buoi8;

import Buoi8.Interface.IZoo;

public class Zoo implements IZoo {
    protected Animal[] zoos = new Animal[10];
    @Override
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

    @Override
    public void makeAllSound() {
        for (Animal animal : zoos) {
            animal.makeSound();
        }
    }

    @Override
    public void displayAllInfo() {
        for (Animal animal : zoos) {
            animal.displayInfo();
            System.out.println("-----------------------");
        }
    }
}
