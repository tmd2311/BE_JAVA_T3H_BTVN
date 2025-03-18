package Bai1.ZooAdvanced;

import Bai1.Animal;
import Bai1.Zoo.Zoo;
import Bai1.Animals.Bird;
import Bai1.Animals.Cat;
import Bai1.Animals.Dog;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZooAdvanced extends Zoo {
    private static final Map<Integer, String> animalMap = Map.of(
            1, "dog",
            2, "cat",
            3, "bird"
    );
    public void inputNumberOfAnimals() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng động vật muốn thêm vào vườn thú: ");
        int soLuong = sc.nextInt();
        for (int i = 0; i < soLuong; i++) {
            addAnimal();
        }
        sortAnimalsByAge();
    }

    private void sortAnimalsByAge() {
        Animal temp = null;
        for (int i = 0; i < zoos.length-1; i++) {
            for (int j = 0; j < zoos.length-i-1; j++) {
                if(zoos[j].getAge() > zoos[j+1].getAge()) {
                    swap(j);
                }
            }
        }
        System.out.println("Danh sách động vật sau khi sắp xếp theo tuổi:");
        displayAllInfo();
    }

    private void swap(int j) {
        Animal temp;
        temp = zoos[j];
        zoos[j] = zoos[j +1];
        zoos[j+1]= temp;
    }


    public void addAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập loại động vật (1: Chó, 2: Mèo, 3: Chim): ");
        int luaChon  = scanner.nextInt();
        Animal animal = null;
        animal = xuLyLuaChon(luaChon);
        if (animal == null) return;
        animal.inputInfo(animalMap.get(luaChon));
        super.addAnimal(animal);

    }


    private static Animal xuLyLuaChon(int luaChon) {
        Animal animal;
        switch (luaChon) {
            case 1:
                animal = new Dog();
                break;
            case 2:
                animal = new Cat();
                break;
            case 3:
                animal = new Bird();
                break;
            default:
                System.out.println("Loại động vật không hợp lệ.");
                return null;
        }
        return animal;
    }
}
