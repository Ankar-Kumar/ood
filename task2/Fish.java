
class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(getName() + " does not make a sound.");
    }

    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}