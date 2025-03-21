package Buoi8.Animals;



import Buoi8.Animal;

import java.util.Scanner;

public class Dog extends Animal {
    private String breed;

    @Override
    public void makeSound(){
        System.out.println("Woof! Woof!");
    }

    @Override
    public void inputInfo(String species){
        super.inputInfo(species);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giống chó: ");
        breed = scanner.nextLine();
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tôi thuộc giống chó: " + breed );
    }

}
