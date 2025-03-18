package Bai1.Zoo;

import Bai1.Animal;
import Bai1.Animals.Bird;
import Bai1.Animals.Cat;
import Bai1.Animals.Dog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int luaChon;
        Zoo zoo = new Zoo();

        System.out.println("Chào mừng đến với sở thú");
        do{
            hienThiMenu();
            System.out.println("Nhập lựa chọn: ");
            luaChon = sc.nextInt();
            xuLyLuaChon(luaChon, zoo);
        }while(luaChon !=0);


    }

    private static void xuLyLuaChon(int luaChon, Zoo zoo) {
        switch (luaChon) {
            case 1:{
                Animal dog = new Dog();
                dog.inputInfo("Chó");
                zoo.addAnimal(dog);
                break;
            }
            case 2:{
                Animal cat = new Cat();
                cat.inputInfo("Mèo");
                zoo.addAnimal(cat);
                break;
            }
            case 3:{
                Animal bird = new Bird();
                bird.inputInfo("Chim");
                zoo.addAnimal(bird);
                break;
            }
            case 4:{
                System.out.println("Đây là các bạn động vật trong sở thú->");
                zoo.displayAllInfo();
                break;
            }
            case 5:{
                zoo.makeAllSound();
                zoo.makeBirdsFly();
                break;
            }
            case 0:{
                break;
            }
            default:{
                System.out.println("Lựa chọn không hợp lệ!!!");
                break;
            }
        }
    }

    private static void hienThiMenu() {
        System.out.println("----Menu-----");
        System.out.println("1.Thêm chó");
        System.out.println("2.Thêm mèo");
        System.out.println("3.Thêm chim");
        System.out.println("4.Xem thông tin các động vật");
        System.out.println("5.Chọc");
        System.out.println("0.THOÁT");
    }
}
