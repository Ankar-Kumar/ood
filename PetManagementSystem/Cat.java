class Cat extends Animal {
    private String owner;
    public Cat(String name, int age,String owner) {
        super(name, age);
        this.owner=owner;

    }
    
    public String getowner() {
        return owner;
    }

    // iccamoto ekta nijosso class creation(optional)
    public void makeSound() {
        System.out.println(getName() + " meows.");
    }
    


}