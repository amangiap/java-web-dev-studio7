package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    public CD (String name, double storageCapacity, String RPM) {
        super(name, storageCapacity, RPM);
    }

    @Override
    public void readData(){
        System.out.println("This CD's title is '" + this.name + "' and has a storage capacity of " + this.storageCapacity + "MB.");
    }
    @Override
    public void spinDisc(){
        System.out.println("This disc spins at " + this.RPM + " rpm.");
    }

}
