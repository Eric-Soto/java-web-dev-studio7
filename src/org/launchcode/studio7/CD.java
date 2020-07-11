package org.launchcode.studio7;

import org.launchcode.studio7.interfaces.OpticalDisc;

public class CD extends Disk implements OpticalDisc {

    private static final Integer minSpinSpeed = 200;
    private static final Integer maxSpinSpeed = 500;

    public CD(String name, double capacity, String discType, Boolean isBranded) {
        super(name, capacity, discType, isBranded);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + minSpinSpeed +" - "+ maxSpinSpeed +" rpm.");
    }

    @Override
    public void storeData(Data data) {

        if (getDiscType().equals("RW") && isSpaceRemaining(data.getSize())){
            addToContent(data);
        }

    }

    @Override
    public void wipeDisk() {

    }
}