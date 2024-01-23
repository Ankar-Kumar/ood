class AnimalCare {
    private String animal_care_hospital_name;
    AnimalCare(String name){
        animal_care_hospital_name=name;
    }
    public void takeCareOfAnimal(Animal animal) {
        System.out.println(animal_care_hospital_name +" of the care which Taking care of " + animal.getName());
    }
}

