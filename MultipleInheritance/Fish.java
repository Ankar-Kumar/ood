class Fish implements Swimming {
    public String name;
    public Fish(String name){
        this.name=name;
    }
    @Override
    public void swim() {
        System.out.println(name + " can swim.");
    }
}