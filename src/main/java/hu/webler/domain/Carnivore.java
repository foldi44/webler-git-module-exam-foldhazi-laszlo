package hu.webler.domain;

public class Carnivore extends Animal implements AnimalActivity {
    private String gender;

    public Carnivore() {
    }

    public Carnivore(String name, int age, String[] colors, String gender) {
        super(name, age, colors);
        this.gender = gender;
    }

    @Override
    public void feed() {
        System.out.println("Eats meat");
    }

    @Override
    public void move() {
        System.out.println("Carnivore can move!");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZ");
    }

    @Override
    public void makeSound() {

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "gender='" + gender + '\'' +
                '}';
    }
}
