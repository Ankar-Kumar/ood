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