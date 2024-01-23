/*

I am firstly take swimming and flying interface class and some method ar calling inside the interface
finally Fish and Bird class implements the interface and add some additional method
and finally implement FlyingFish class for inherit both the interface which means multiple inheritance using interface
at last in main function Iam call all the class object and printing some text 
*/

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("sparrow");
        Fish fish=new Fish("Salmon");
        FlyingFish flyingFish = new FlyingFish(fish,bird);

        fish.swim();                  
        flyingFish.swim(); 
        
        bird.fly(); 
        flyingFish.fly();    
    }
}
