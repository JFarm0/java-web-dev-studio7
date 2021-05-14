package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String aName, String aDiscType, int aStorageCapacity, int aCapacityUsed) {
        super(aName, aDiscType, aStorageCapacity, aCapacityUsed);

    }

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("DVD loading...");
    }

    @Override
    public void readData() {
        System.out.println("Film present!");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public void menuPresent(){
        if (getDiscType().equals("DVD")) {
            System.out.println("Loading menu.");
        } else {
            System.out.println("You should probably not put this in a DVD player.");
        }
    }
}
