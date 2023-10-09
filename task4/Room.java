
public class Room implements IStructure {
    public String name;
    public double area;
    public double volume;

    public Room(String name, double area, double volume) {
        this.name = name;
        this.area = area;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    public void enter() {
        System.out.println("You have entered the " + this.getName());
    }

    public void exit() {
        System.out.println("You have left the " + this.getName());
    }

    public void location() {
        System.out.println("You are currently in the " + this.getName());
    }


    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }
}