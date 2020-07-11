package org.launchcode.studio7;

import org.launchcode.studio7.interfaces.OpticalDisc;

public class DVD extends Disk implements OpticalDisc {

    private static final Integer minSpinSpeed = 570;
    private static final Integer maxSpinSpeed = 1600;

    public DVD(String name, double capacity, String discType, Boolean isBranded) {
        super(name, capacity, discType, isBranded);
    }



    @Override
    public void spinDisc() {
        System.out.println("Executing Disc..........\n");
        System.out.println("A DVD spins at a rate of " + minSpinSpeed +" - "+ maxSpinSpeed +" rpm.");

        for(Data content: this.getContents()){
            System.out.println(content.getType() + " ===> " + content.getSize());
        }

        System.out.println("\n" + this.getName() + " \n " + "Max Capacity => " + this.getCapacity());

        System.out.println("\n......Completed");
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