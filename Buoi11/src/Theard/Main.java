package Theard;

public class Main {
    public static void main(String[] args) {
        Runnable theard1 = new Theard(1, 10, "Thread1");
        Runnable theard2 = new Theard(11, 20,"Thread2");
        Runnable theard3 = new Theard(21,30, "Thread3");

        theard1.run();
        theard2.run();
        theard3.run();
    }

}
