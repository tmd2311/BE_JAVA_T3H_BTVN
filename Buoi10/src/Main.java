import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person ps1 = new Person(5,"Dung5")
                ,ps2 = new Person(2,"Dung2")
                ,ps3 = new Person(3,"Dung3")
                ,ps4 = new Person(4,"Dung4")
                ,ps5 = new Person(1,"Dung1");
        List<Person> people = new ArrayList<>();
        people.add(ps1);
        people.add(ps2);
        people.add(ps3);
        people.add(ps4);
        people.add(ps5);
        people.forEach(data -> System.out.println(data.getName()));

//        search(people);
//
//        delete(people);
        System.out.println("Sau khi sap xep");

        //Colection.sort auto sap xep theo giam gian neu (o1 - o2) > 0  thi swap
        Collections.sort(people, Comparator.comparing(Person::getId).reversed());

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }


        });

        people.forEach(data -> System.out.println(data.getName()));



    }

    private static void delete(List<Person> people) {
        Person person= search(people);
        if (person != null) {
            people.remove(person);
            System.out.println("Xoa thanh cong");
            return;
        }
        System.out.println("Khong the xoa");

    }

    private static Person search(List<Person> people) {
        System.out.println("Nhap ten: ");
        String name = new Scanner(System.in).nextLine();
        for (Person p : people) {
            if(name.toLowerCase().equals(p.getName().toLowerCase())){
                System.out.println("Tim thay nguoi dung: ");
                System.out.println("Id: "+ p.getId()+" ---Name: " +p.getName());
                return p;
            }
        }
        System.out.println("Khong tim thay");
        return null;
    }
}