package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String aName, String aDiscType, int aStorageCapacity, int aCapacityUsed) {
        super(aName, aDiscType, aStorageCapacity, aCapacityUsed);
    }

    // TODO: Implement your custom interface.

    @Override
    public void spinDisc(){
        System.out.println("Spinning up...first track coming up!");
    }

    @Override
    public void readData(){
        System.out.println("There are several songs on this album.");
    }

    public void rockOut() {
        if (getDiscType().equals("CD")){
            System.out.println("Rocking tunes!");
        } else {
            System.out.println("This is data, nerd.");
        }
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
