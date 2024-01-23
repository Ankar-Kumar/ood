class PetShop {
    private String name;

    public PetShop(String name) {
        this.name = name;
    }
    // petshop theke kun animal ar koto age er animal sell kora holo
    public void sellPet(Animal pet) { //Animal class neuar jnno jekono animal(cat,dog) class call kora jabe
        System.out.println(name + " sells " + pet.getName() + " age is " + pet.getAge());
    }
}