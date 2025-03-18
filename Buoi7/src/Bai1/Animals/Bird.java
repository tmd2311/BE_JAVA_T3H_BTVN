package Bai1.Animals;

import Bai1.Animal;

import java.util.Scanner;

public class Bird extends Animal {
    private String wingSpan;

    @Override
    public void makeSound() {
        System.out.println("Tweet! Twee");
    }
    @Override
    public void inputInfo(String species){
        super.inputInfo(species);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập sải cánh(cm): ");
        wingSpan = scanner.nextLine();
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tớ có sải cánh dài " + wingSpan + "cm");
    }
    public void fly(){
        System.out.println(getName()+ " đang bay");
    }
}
