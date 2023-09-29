/*

I am firstly take swimming and flying interface class and some method ar calling inside the interface
finally Fish and Bird class implements the interface and add some additional method
and finally implement FlyingFish class for inherit both the interface which means multiple inheritance using interface
at last in main function Iam call all the class object and printing some text 
*/





interface Swimming {
    void swim();
}

interface Flying {
    void fly();
}

class Fish implements Swimming {
    private String name;
    public Fish(String name){
        this.name=name;
    }
    @Override
    public void swim() {
        System.out.println(name + " can swim.");
    }
}

class Bird implements Flying {
    public String name;
    public Bird(String name) {
        this.name = name;
    }
    @Override
    public void fly() {
        System.out.println(name + "can fly.");
    }
}

class FlyingFish implements Swimming, Flying {
    private Fish fish;
    private Bird bird;
    // private String name;
    public FlyingFish(String fish,String brd) {  // Constructor
        this.fish = new Fish(fish);
        this.bird = new Bird(brd);
    }

    @Override
    public void swim() {
        fish.swim();
    }

    @Override
    public void fly() {
        bird.fly();
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Fish fish = new Fish("Salmon");
        Bird bird = new Bird("sparrow");
        FlyingFish flyingFish = new FlyingFish("Salmon","sparrow");

        fish.swim();                  
        flyingFish.swim(); 
        
        bird.fly(); 
        flyingFish.fly();    
    }
}
