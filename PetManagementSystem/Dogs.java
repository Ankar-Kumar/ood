public class Dogs extends Animal {
    public Dogs(String name, int age) {
        super(name, age); //animal class parameter passing
    }

    public void makeSound() {
        System.out.println(getName() + " barks.");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching a ball.");
    }
}