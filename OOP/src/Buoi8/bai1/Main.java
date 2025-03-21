package Buoi8.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IChia2So thuong1 = new IChia2So() {
            @Override
            public double chia(int a, int b) {
                return (double) a/b;
            }
        };
        IChia2So thuong2 = (a1,b1) -> (double) a/b;
        System.out.println("Cách 1: " + thuong1.chia(a, b) );
        System.out.println("Cách 2: "+ thuong2.chia(a, b) );
    }
}
