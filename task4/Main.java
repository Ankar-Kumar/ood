
public class Main {
    public static void main(String[] args) {
        // Create the building
        Housing building = new Housing("123 Street");

        // Create the first floor
        Housing floor1 = new Housing("123 Street - First Floor");

        int firstFloor = building.addStructure(floor1);

        // Create rooms on the first floor with area and volume
        Room washroom1m = new Room("1F Men's Washroom", 50.0, 100.0);
        Room washroom1w = new Room("1F Women's Washroom", 50.0, 100.0);
        Room common1 = new Room("1F Common Area", 200.0, 400.0);

        // Add rooms to the first floor
        int firstMens = floor1.addStructure(washroom1m);
        int firstWomans = floor1.addStructure(washroom1w);
        int firstCommon = floor1.addStructure(common1);

        // Enter the building
        building.enter(); //printing building name

        // Enter the first floor
        Housing currentFloor = (Housing) building.getStructure(firstFloor);
        currentFloor.enter(); //okk

        // Enter the men's room on the first floor
        Room currentRoom = (Room) currentFloor.getStructure(firstMens);
        currentRoom.enter(); //okk

        // Exit the men's room, the first floor, and the building
        currentRoom.exit();
        currentFloor.exit();
        building.exit();

        // // Print the total area and volume of the building
        System.out.println("Total Area of the Building: " + building.getArea() + " sq. ft.");
        System.out.println("Total Volume of the Building: " + building.getVolume() + " cubic ft.");
    }
}