package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {

    private String name;
    private final String discType;
    private final int storageCapacity;
    private int capacityUsed;
    private int remainingCapacity;


    public BaseDisc(String aName, String aDiscType, int aStorageCapacity, int aCapacityUsed) {
        name = aName;
        discType = aDiscType;
        storageCapacity = aStorageCapacity;
        capacityUsed = aCapacityUsed;
        remainingCapacity = spaceLeft();
    }

    private int spaceLeft() {
        return storageCapacity - capacityUsed;
    }

    public String getName() {
        return name;
    }

    public String getDiscType() {
        return discType;
    }

    public void discInfo() {
        String output = "Disc Name: " + name + "\nDisc Type: " + discType + "\nAmount of data used: " + capacityUsed + "/" + storageCapacity;
        System.out.println(output);
    }

}
