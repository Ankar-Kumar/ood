class FlyingFish implements Swimming, Flying {
    private Fish fish;
    private Bird bird;
    // private String name;
    public FlyingFish(Fish fish,Bird brd) {  // Constructor
        this.fish = fish;
        this.bird = brd;
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