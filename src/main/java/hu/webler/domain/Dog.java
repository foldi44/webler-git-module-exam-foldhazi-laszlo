package hu.webler.domain;

import java.util.Arrays;

public class Dog extends Carnivore implements AnimalActivity{
    public Dog() {
    }

    public Dog(String name, int age, String[] colors, String gender) {
        super(name, age, colors, gender);
    }

    @Override
    public void feed() {
        System.out.println("Eating dog food");
    }

    @Override
    public void makeSound() {
        System.out.println("Awoooouuu");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", colors=" + Arrays.toString(this.getColors()) +
                ", gender='" + super.getGender() + '\'' + "}";
    }
}
