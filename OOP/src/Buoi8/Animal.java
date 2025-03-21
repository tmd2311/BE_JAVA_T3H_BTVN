package Buoi8;

import java.util.Scanner;

public abstract class Animal {
    private String name;
    private int age;
    private String species;
    private String color;


    public abstract void makeSound();

    public void inputInfo(String species){
        this.species = species;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập màu: " );
        color = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
    }

    public void displayInfo(){
        System.out.println("Xin chào, tớ tên là " + name);
        makeSound();
        System.out.println("Tớ " + age+ " tuổi");
        System.out.println("Tớ có màu " + color);

    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
