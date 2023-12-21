package hu.webler.domain;

import java.util.Arrays;

public class Cat extends Carnivore implements AnimalActivity{
    public Cat() {
    }

    public Cat(String name, int age, String[] colors, String gender) {
        super(name, age, colors, gender);
    }

    @Override
    public void feed() {
        System.out.println("Eating cat food");
    }

    @Override
    public void makeSound() {
        System.out.println("Meoooow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", colors=" + Arrays.toString(this.getColors()) +
                ", gender='" + super.getGender() + '\'' + "}";
    }
}
