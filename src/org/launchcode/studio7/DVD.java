package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD (String name, double storageCapacity, String RPM) {
        super(name, storageCapacity, RPM);
    }

    @Override
    public void readData(){
        System.out.println("This is a movie called " + this.name + ". It has a storage capacity of: " + this.storageCapacity + "GB.");
    }
    @Override
    public void spinDisc(){
        System.out.println("This disc spins at " + this.RPM + " rpm.");
    }


}
