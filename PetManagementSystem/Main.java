
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 12,"Adrita");
        // Animal cat = new Cat("Whiskers", 2,"Akif");
        // Animal fish = new Fish("Nemo", 1,"Farjana");

        dog.eat();
        // cat.eat();
        // fish.eat();
       


        PetShop petShop = new PetShop("City Pet");
        AnimalCare animalCare=new AnimalCare();
        PetService petService=new PetService();
        
        petShop.sellPet(dog);
        // petShop.sellPet(cat);
        // petShop.sellPet(fish);

        animalCare.takeCareOfAnimal(dog);
        // animalCare.takeCareOfAnimal(cat);
        // animalCare.takeCareOfAnimal(fish);


        petService.provideService(dog, "Cleaning");
        // petService.provideService(cat, "Treatment");
        // petService.provideService(fish,"give food");
    }
}
