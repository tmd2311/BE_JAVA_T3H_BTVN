package Bai1.Animals;

import Bai1.Animal;

import java.util.Scanner;

public class Cat extends Animal {
    private String breed;

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
    @Override
    public void inputInfo(String species) {
        super.inputInfo(species);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giống mèo: ");
        breed = scanner.nextLine();
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tớ thuộc giống mèo " + breed);
    }
}
