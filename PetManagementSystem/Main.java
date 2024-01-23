
public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat("white_bruce", 10, "Leo");
        cat.eat();
        cat.getowner();
        


        PetShop petShop = new PetShop("City Pet");
        petShop.sellPet(cat);

        AnimalCare animalCare=new AnimalCare("RU"); 
        animalCare.takeCareOfAnimal(cat);
    }
}
