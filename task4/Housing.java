
import java.util.ArrayList;


public class Housing implements IStructure {
    private ArrayList<IStructure> structures;
    private String address;

    public Housing(String address) {
        this.structures = new ArrayList<IStructure>();
        this.address = address;
    }

    public String getName() {
        return address;
    }

    public int addStructure(IStructure component) {
        structures.add(component);
        return structures.size() - 1;
    }

    public IStructure getStructure(int componentNumber) {
        return structures.get(componentNumber);
    }

    public void location() {
        System.out.println("You are currently in " + getName() + ". It has ");
        for (IStructure struct : structures)
            System.out.println(struct.getName());
    }

    public void enter() {
        System.out.println("You have entered the " +getName());
    }

    public void exit() {
        System.out.println("You have left the " +getName());
    }

    @Override
    public double getArea() {

        double totalArea = 0;
        for (IStructure struct : structures)
            totalArea += struct.getArea();
        return totalArea;
    }

    @Override
    public double getVolume() {
        double totalVolume = 0;
        for (IStructure struct : structures)
            totalVolume += struct.getVolume();
        return totalVolume;
    }
}