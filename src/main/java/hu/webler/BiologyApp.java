package hu.webler;

import hu.webler.domain.*;

public class BiologyApp {

    public static void main(String[] args) {

        Dog staffordshireterrier = new Dog("Shelby", 5, new String[] {"Brown", "Black", "White"}, "Male");
        System.out.println(staffordshireterrier);
        staffordshireterrier.makeSound();

        Cat hybrid = new Cat("Cirmi", 2, new String[] {"Black", "White"}, "Female");
        System.out.println(hybrid);
        hybrid.makeSound();

        staffordshireterrier.setGender("Female");
        System.out.println(staffordshireterrier);

        Dog canecorso = new Dog("Ghost", 7, new String[] {"Black"}, "Male");
        System.out.println(canecorso);
        canecorso.makeSound();

        Cat persian = new Cat("Cratos", 4, new String[] {"Grey"}, "Male");
        System.out.println(persian);
        persian.makeSound();
    }
}
