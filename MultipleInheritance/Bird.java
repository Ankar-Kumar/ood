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